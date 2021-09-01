package Part2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co ordinates of the two points of 1st Line:");
		System.out.println("Enter the X co-ordinate of point A:");
		double x1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Y co-ordinate of point A: ");
		double y1=Integer.parseInt(sc.nextLine());
		double distance;
	     distance=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
		 System.out.println("Distance of point from Origin(0,0) by Eucledian method is:" + distance);
	}
}

/*Output
Enter the co ordinates of the two points of 1st Line:
Enter the X co-ordinate of point A:
9
Enter the Y co-ordinate of point A: 
5
Distance of point from Origin(0,0) by Eucledian method is:10.0
*/