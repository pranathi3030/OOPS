
	import java.util.Scanner;

	public class AverageCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter three numbers: ");
	        double num1 = sc.nextDouble();
	        double num2 = sc.nextDouble();
	        double num3 = sc.nextDouble();

	        // Single expression to calculate average
	        double average = (num1 + num2 + num3) / 3;

	        System.out.printf("\nAverage of %.2f, %.2f, %.2f is: %.2f\n", num1, num2, num3, average);

	        sc.close();
	    }
	}

