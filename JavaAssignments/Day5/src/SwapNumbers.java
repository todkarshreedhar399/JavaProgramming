import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number 1 : ");
	       int a=Integer.parseInt(sc.nextLine());
	       System.out.println("Enter the number 2 : ");
	       int b=Integer.parseInt(sc.nextLine());
	       swapnumbers(a, b);
	      
	}
	static void swapnumbers(int n1 , int n2)
	{
		 System.out.println("Before Swapping:");
	       System.out.println("Number 1 is " + n1);
	       System.out.println("Number 2 is " + n2);
	       int temp=n1;
	       n1=n2;
	       n2=temp;
	       System.out.println("After Swapping:");
	       System.out.println("Number 1 is " + n1);
	       System.out.println("Number 2 is " + n2);
	}

}
/*Output
Enter the number 1 : 
29
Enter the number 2 : 
13
Before Swapping:
Number 1 is 29
Number 2 is 13
After Swapping:
Number 1 is 13
Number 2 is 29
*/