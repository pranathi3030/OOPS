
	import java.util.Scanner;

	public class BitwiseDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second integer: ");
	        int b = sc.nextInt();

	        System.out.println("\n--- Bitwise Operations ---");
	        System.out.printf("a        = %d (Binary: %s)\n", a, Integer.toBinaryString(a));
	        System.out.printf("b        = %d (Binary: %s)\n", b, Integer.toBinaryString(b));

	        System.out.printf("a & b    = %d (Binary: %s)\n", a & b, Integer.toBinaryString(a & b));
	        System.out.printf("a | b    = %d (Binary: %s)\n", a | b, Integer.toBinaryString(a | b));
	        System.out.printf("a ^ b    = %d (Binary: %s)\n", a ^ b, Integer.toBinaryString(a ^ b));
	        System.out.printf("a << 1   = %d (Binary: %s)\n", a << 1, Integer.toBinaryString(a << 1));
	        System.out.printf("b >> 1   = %d (Binary: %s)\n", b >> 1, Integer.toBinaryString(b >> 1));

	        sc.close();
	    }
	}

