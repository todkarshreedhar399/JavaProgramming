import java.util.Scanner;

public class Largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number 1 : ");
	       int n1=Integer.parseInt(sc.nextLine());
	       System.out.println("Enter the number 2 : ");
	       int n2=Integer.parseInt(sc.nextLine());
	       System.out.println("Enter the number 3 : ");
	       int n3=Integer.parseInt(sc.nextLine());
	       largestof3(n1, n2, n3);
	       
	}
	static void largestof3(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n3)
	       {
	    	   System.out.println("Number 1 is Greatest");
	       }
	       else if(n2>n3)
	       {
	    	   System.out.println("Number 2 is Greatest");
	       }
	       else
	       {
	    	   System.out.println("Number 3 is Greatest");
	       }
	}

}
/*Output
 Enter the number 1 : 
10
Enter the number 2 : 
20
Enter the number 3 : 
30
Number 3 is Greatest
*/