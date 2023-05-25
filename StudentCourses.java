import java.util.ArrayList;
import java.util.List;
public class StudentCourses {
    private String name;
    private int grade;
    private List<String> courses;
    public StudentCourses(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public List<String> getCourses() {
        return courses;
    }
    public static void main(String[] args) {
        // Creating a student object
        StudentCourses student = new StudentCourses("John Doe", 10);
        // Adding courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        // Removing a course
        student.removeCourse("Science");
        // Getting the student's name, grade, and courses
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());
    }
}

