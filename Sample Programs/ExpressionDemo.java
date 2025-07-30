
public class ExpressionDemo {
	    public static void main(String[] args) {
	        int expr1 = 10 + 2 * 5;         // Multiplication happens first: 10 + (2*5) = 20
	        int expr2 = (10 + 2) * 5;       // Parentheses force addition first: (10+2)*5 = 60
	        int expr3 = 100 / 5 + 2 * 3 - 4;// 100/5 = 20 → 2*3 = 6 → 20+6-4 = 22

	        System.out.println("10 + 2 * 5         = " + expr1);
	        System.out.println("(10 + 2) * 5       = " + expr2);
	        System.out.println("100 / 5 + 2 * 3 - 4 = " + expr3);
	    }
	}

