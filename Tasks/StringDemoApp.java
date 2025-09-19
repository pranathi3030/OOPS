package Tasks;


import java.util.Arrays;

public class StringDemoApp {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";  // refers to same interned object
        String s3 = new String("hello"); // creates a new object

        System.out.println("s1 == s2: " + (s1 == s2));   // true
        System.out.println("s1 == s3: " + (s1 == s3));   // false
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

        // immutability
        String s4 = s1.concat(" world");
        System.out.println("Original s1: " + s1);
        System.out.println("After concat s4: " + s4);

        // arrays of strings
        String[] subjects = {"Java", "DBMS", "OS", "Networks"};
        System.out.println("Subjects: " + Arrays.toString(subjects));
    }
}
