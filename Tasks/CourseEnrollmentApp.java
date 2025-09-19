package Tasks;

import java.util.ArrayList;
import java.util.List;

public class CourseEnrollmentApp {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Alice", 101);
        Pupil p2 = new Pupil("Bob", 102);

        Courseget c1 = new Courseget("Java");
        Courseget c2 = new Courseget("DBMS");
        Courseget c3 = new Courseget("Operating Systems");

        p1.enrollCourse(c1);
        p1.enrollCourse(c2);

        p2.enrollCourse(c2);
        p2.enrollCourse(c3);

        p1.showDetails();
        p2.showDetails();
    }
}

class Courseget {
    private String courseName;

    public Courseget(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }
}

class Pupil {
    private String name;
    private int rollNumber;
    private List<Courseget> enrolledCourses;

    public Pupil(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Courseget course) {
        enrolledCourses.add(course);
    }

    public List<Courseget> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses);  // defensive copy
    }

    public void showDetails() {
        System.out.println("Pupil: " + name + " (Roll No: " + rollNumber + ")");
        System.out.println("Enrolled Courses: " + enrolledCourses);
        System.out.println();
    }
}
