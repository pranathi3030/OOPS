
	import java.util.Scanner;

	public class CharToAscii {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);  // Reads the first character of input

	        int ascii = ch; // Implicitly converts char to its ASCII integer value

	        System.out.println("\n--- ASCII Conversion ---");
	        System.out.println("Character entered : " + ch);
	        System.out.println("ASCII value       : " + ascii);
	        System.out.println("Integer form      : " + ascii); // Same as ASCII here

	        sc.close();
	    }
	}

