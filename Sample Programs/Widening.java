
public class Widening {
	    public static void main(String[] args) {
	        int intVal = 50000;
	        long longVal = intVal;        // int → long
	        float floatVal = longVal;     // long → float

	        System.out.println("Integer Value : " + intVal);
	        System.out.println("Long Value    : " + longVal);
	        System.out.println("Float Value   : " + floatVal);
	    }
}
