import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter power for 2: ");
	       int n=Integer.parseInt(sc.nextLine());
	       poweroftwo(n);

	}
	static void poweroftwo(int n)
	{
		int value=1;
	       for(int i=0; i<=n; i++)
	       {
	    	   if(i==0)
	    	   {
	    	   System.out.println("2 ^ "+i+ " = " + value);
	    	   continue;
	    	   }
	    	   value=value*2;
	    	   System.out.println("2 ^ "+i+ " = " + value);
	       }
	}

}
/*Output
 Enter power for 2: 
8
2 ^ 0 = 1
2 ^ 1 = 2
2 ^ 2 = 4
2 ^ 3 = 8
2 ^ 4 = 16
2 ^ 5 = 32
2 ^ 6 = 64
2 ^ 7 = 128
2 ^ 8 = 256
*/