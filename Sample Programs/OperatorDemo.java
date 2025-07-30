
	import java.util.Scanner;
	public class OperatorDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        // Arithmetic Operations
	        System.out.println("\n--- Arithmetic Operations ---");
	        System.out.println("Addition       : " + (a + b));
	        System.out.println("Subtraction    : " + (a - b));
	        System.out.println("Multiplication : " + (a * b));
	        System.out.println("Division       : " + (a / b));
	        System.out.println("Modulus        : " + (a % b));

	        // Logical Operations
	        System.out.println("\n--- Logical Operations ---");
	        System.out.println("(a > b) && (a != 0) : " + ((a > b) && (a != 0)));
	        System.out.println("(a < b) || (b == 0): " + ((a < b) || (b == 0)));
	        System.out.println("!(a == b)          : " + (!(a == b)));

	        // Bitwise Operations
	        System.out.println("\n--- Bitwise Operations ---");
	        System.out.println("a & b  : " + (a & b));
	        System.out.println("a | b  : " + (a | b));
	        System.out.println("a ^ b  : " + (a ^ b));
	        System.out.println("~a     : " + (~a));
	        System.out.println("a << 1 : " + (a << 1));
	        System.out.println("b >> 1 : " + (b >> 1));

	        sc.close();
	    }
	}