
	import java.util.Scanner;

	public class CircleCalculation {
	    public static void main(String[] args) {
	        final double PI = 3.14159;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius of the circle: ");
	        double radius = sc.nextDouble();

	        double area = PI * radius * radius;
	        double circumference = 2 * PI * radius;

	        System.out.printf("Area         : %.4f\n", area);
	        System.out.printf("Circumference: %.4f\n", circumference);

	        sc.close();
	    }
	}

