package Part2;

import java.util.Scanner;

public class WindChill {
	public static double windChill(int t,int v)
	{
		double wind=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return wind;
	}
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int t,v;
	 while(true) {
	 System.out.println("Enter t's Value:");
	 t = sc.nextInt();
	if(t<5) {
		System.out.println("Not valid value Enter the t value greater than 50");
		continue;
	}
	else
		break;
	 }
	 while(true) {
		 System.out.println("Enter v's Value:");
		 v = sc.nextInt();
		if(v<200) {
			System.out.println("Not valid value Enter the v value greater than 200");
			continue;
		}
		else
			break;
		 }
	double result= windChill(t, v);
	System.out.println("Answer is: "+ windChill(t, v));
	
}
}
