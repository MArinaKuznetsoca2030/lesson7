import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class lesson7 {
    public static void main(String[] args) throws IOException {
        Course math = new Course("math");
        Course russianLanguage = new Course("Russian Lenguage");

        Course[] baseCourses = {math, russianLanguage};
        Student student =  new Student("Alex", 20, baseCourses);

        ObjectMapper objectMapper= new ObjectMapper();
        String jsonStudent = objectMapper.writeValueAsString(student);
        objectMapper.writeValue(new File("Student.json"), student);
        System.out.println(jsonStudent);

        Student student2 = objectMapper.readValue(new File("Student2.json"), Student.class);
        System.out.println(student2.getCourses()[0].getName());

        JsonNode jsonNode = objectMapper
                .readTree(jsonStudent)
                .at("/courses/0/name");
        System.out.println(jsonNode.asText());

    }
}
