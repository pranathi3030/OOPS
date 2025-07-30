import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name       : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Age        : ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume leftover newline before nextLine()
        System.out.print("Enter Gender     : ");
        String gender = sc.nextLine();

        System.out.print("Enter Percentage : ");
        float percentage = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.printf("%-15s: %s\n", "Name", name);
        System.out.printf("%-15s: %d\n", "Roll Number", rollNumber);
        System.out.printf("%-15s: %d\n", "Age", age);
        System.out.printf("%-15s: %s\n", "Gender", gender);
        System.out.printf("%-15s: %.2f%%\n", "Percentage", percentage);

        sc.close();
    }
}
