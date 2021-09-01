import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the last number : ");
	       int n=Integer.parseInt(sc.nextLine());
	       primefactors(n);

	}
	static void primefactors(int n)
	{
		int flag=1;
	       System.out.println("Prime Factors of Number are: ");
	       for(int i=1;i<=n/2;i++)
	       {
	    	   if(n%i==0)
	    	   {
	    		   for(int j=2;j<i;j++)
	    		   {
	    			   if(i%j==0)
	    			   {
	    				   flag=0;
	    				   break;
	    			   }
	    			   else
	    			   {
	    				   flag=1;
	    			   }
	    			   
	    		   }
	    		   if(flag==1)
	    		   {
	    			   System.out.print(i +" ");
	    		   }
	    	   }
	       }
	}

}
/*Output
Enter the last number : 
18
Prime Factors of Number are: 
1 2 3 
*/