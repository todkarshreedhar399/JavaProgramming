import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of times to flip coin");
       int n=Integer.parseInt(sc.nextLine());
       flipcoins(n);
	}
	static void flipcoins(int times)
	{    
		 int value;
	       int head_count=0;
	       int tail_count=0;
		 for(int i=0; i<times; i++)
	       {
	       value=(int)Math.floor(Math.random()*10)%2;
	       if (value==0)
	       {
	       System.out.println("We got Tails");
	       tail_count++;
	       }
	       else
	       {
	    	   System.out.println("We got Heads");
	    	   head_count++;
	       }
	       }
	       System.out.println("We got tails "+tail_count + " Times.");
	       System.out.println("We got heads "+head_count + " Times.");
	}

}
/*Output
Enter number of times to flip coin
8
We got Tails
We got Heads
We got Tails
We got Tails
We got Heads
We got Tails
We got Heads
We got Heads
We got tails 4 Times.
We got heads 4 Times. 

*/