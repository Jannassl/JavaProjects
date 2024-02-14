import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    private String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }
}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private int enrollmentDate;
    public Enrollment(Student student, Course course, int enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }
}

public class Main {
    private final static String FILENAME = "enrollment.ser";

    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Jane Smith");
        Enrollment enrollment = new Enrollment(student, course, 20210101);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(enrollment);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Enrollment e = (Enrollment) ois.readObject();
            System.out.println(enrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}