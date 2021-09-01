import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number : ");
	       double n=Integer.parseInt(sc.nextLine());
	       System.out.println("Enter the Divisor: ");
	       double d=Integer.parseInt(sc.nextLine());
	      quotientremainder(n, d);

	}
	static void quotientremainder(double n, double d) {
		 System.out.println("Quotient is:");
	       double quotient=n/d;
	       System.out.println(quotient);
	       System.out.println("Quotient is:");
	       double remainder=n%d;
	       System.out.println(remainder);
	}

}
/*Output
Enter the number : 
14
Enter the Divisor: 
5
Quotient is:
2.8
Quotient is:
4.0

*/