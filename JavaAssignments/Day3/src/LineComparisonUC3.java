import java.util.Scanner;

public class LineComparisonUC3 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co ordinates of the two points of 1st Line:");
		System.out.println("Enter the X co-ordinate of point A:");
		int x1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Y co-ordinate of point A: ");
		int y1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the X co-ordinate of point B: ");
		int x2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Y co-ordinate of point B: ");
		int y2=Integer.parseInt(sc.nextLine());
		double length1;
		 
	     length1=Math.sqrt(Math.pow(x1-x2,2)-Math.pow(y1-y2,2));
		 System.out.println("Length of a Line is:" + length1);
		 
		    System.out.println("Enter the co ordinates of the two points of second line:");
		    System.out.println("Enter the X co-ordinate of point C: ");
		    int x3=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Y co-ordinate of point C: ");
			int y3=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the X co-ordinate of point D: ");
			int x4=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Y co-ordinate of point D: ");
			int y4=Integer.parseInt(sc.nextLine());
			double length2;
			 
		     length2=Math.sqrt(Math.pow(x3-x4,2)-Math.pow(y3-y4,2));
			 System.out.println("Length of a Line is:" + length2);
		
			 if(length1==length2)
			 {
				 System.out.println("Equal Lines");
			 }
			 else if(length1>length2)
			 {
				 System.out.println("Line 1 length is greater.");
			 }
			 else
			 {
				 System.out.println("Line 2 length is greater.");
			 }
	}
	
	
}