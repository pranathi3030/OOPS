package Tasks;

import java.util.Arrays;

public class StudentInfoApp {
    public static void main(String[] args) {
        Student s1 = new Student("Anita Sharma", 202, new int[]{85, 90, 78});
        s1.showDetails();

        // update using mutators
        s1.setName("Anita R. Sharma");
        s1.setMarks(new int[]{88, 92, 80});
        System.out.println("\nAfter Updating:");
        s1.showDetails();
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Accessors
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public int[] getMarks() { return marks; }

    // Mutators
    public void setName(String name) { this.name = name; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setMarks(int[] marks) { this.marks = marks; }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
}
