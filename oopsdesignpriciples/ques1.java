package oopsdesignpriciples;
// School and Students with Courses 

import java.util.ArrayList;
import java.util.List;

public class ques1 {
    class Course {
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // maintain bidirectional association
        }
    }

    public String getCourseName() {
        return courseName;
    }
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // maintain bidirectional association
        }
    }

    public String getName() {
        return name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
class School {
    private String schoolName;
    private List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student); // aggregation: school holds reference
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}




    
}
