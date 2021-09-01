import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the year to check if Leap:");
	       int year=Integer.parseInt(sc.nextLine());
	       leapyear(year);
	}
	static void leapyear(int year)
	{
		  if (year > 1000)
	       {
	       if (year % 4 == 0)
	       {
	    	   System.out.println("Its a Leap Year");
	       }
	       else
	       System.out.println("Not a Leap Year");
	       }
	       
	       else {
	    	   System.out.println("Year should be in 4 digits");
	       }
	}

}
/*Output
Enter the year to check if Leap:
2012
Its a Leap Year
*/