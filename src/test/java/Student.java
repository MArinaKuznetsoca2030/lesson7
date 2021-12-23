import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private String name;
    private int age;

    @JsonIgnore //не будет сохраняться
    private boolean isActive;

    private Course[] courses;
    public Student(){}

    public Student(String name, int age, Course [] courses){
        this.name = name;
        this.age = age;
        this.courses =  courses;
        isActive = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
/* чтобы поля не записывались в файл не должно быть геттеров и сеттеров
добавить @JsonIgnoreProperties(ignoreUnknown = true)
         @JsonIgnore //не будет сохраняться

    public boolean isActive() {
        return isActive;
    }


  public void setActive(boolean active) {
        isActive = active;
    }
    */

    public Course[] getCourses() {
        return courses;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

}
