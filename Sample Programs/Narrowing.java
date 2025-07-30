
	import java.util.Scanner;

	public class Narrowing{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal value (double): ");
	        double doubleVal = sc.nextDouble();

	        int intVal = (int) doubleVal; // Explicit cast from double to int

	        System.out.println("\n--- Type Conversion Output ---");
	        System.out.println("Original double value : " + doubleVal);
	        System.out.println("Converted int value   : " + intVal);

	        sc.close();
	    }
	}

