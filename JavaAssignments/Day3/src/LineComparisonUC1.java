import java.util.Scanner;

public class LineComparisonUC1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co ordinates of the two points:");
		System.out.println("Enter the X co-ordinate of point A:");
		int x1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Y co-ordinate of point A: ");
		int y1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the X co-ordinate of point B: ");
		int x2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Y co-ordinate of point B: ");
		int y2=Integer.parseInt(sc.nextLine());
		double length;
		 
	     length=Math.sqrt(Math.pow(x1-x2,2)-Math.pow(y1-y2,2));
		 System.out.println("Length of a Line is:" + length);
		
	}

}
/*
Output:
Enter the co ordinates of the two points:
Enter the X co-ordinate of point A:
1
Enter the Y co-ordinate of point A: 
9
Enter the X co-ordinate of point B: 
5
Enter the Y co-ordinate of point B: 
9
Length of a Line is:4.0
*/