package Part2;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		double a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter b:");
		double b = Integer.parseInt(sc.nextLine());
		System.out.println("Enter c:");
		double c = Integer.parseInt(sc.nextLine());
		roots(a,b,c);
	
	}
	static void roots(double a, double b, double c )
	{
		System.out.println("Quadratic Equation is: ");
		System.out.println(a + " x2 + " + b + "x + " + c );
		System.out.println("Delta Value(b*b-4ac)=");
		double delta= (Math.pow(b,2)-4*a*c);
		System.out.println(delta);
		System.out.println("Root 1(-b + sqrt(delta))/(2*a))=");
		System.out.println((-b+Math.sqrt(delta))/(2*a));
		System.out.println("Root 2(-b - sqrt(delta))/(2*a))=");
		System.out.println((-b-Math.sqrt(delta))/(2*a));
	}
}
/*Output
Enter a:
1
Enter b:
2
Enter c:
1
Quadratic Equation is: 
1.0 x2 + 2.0x + 1.0
Delta Value(b*b-4ac)=
0.0
Root 1(-b + sqrt(delta))/(2*a))=
-1.0
Root 2(-b - sqrt(delta))/(2*a))=
-1.0
*/