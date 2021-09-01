import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number : ");
	       int n1=Integer.parseInt(sc.nextLine());
	       evenodd(n1);
	       
	}

	 static void evenodd(int n1) {
		// TODO Auto-generated method stub
		 if(n1%2==0)
	    	   System.out.println("Even Number");
	       else
	    	   System.out.println("Odd Number");
	}
	

}
/*Output
 Enter the number : 
12
Even Number
*/