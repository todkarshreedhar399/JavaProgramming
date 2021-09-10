import java.util.Scanner;

public class EmpWageUC8 {
	int isFullTime=1;
	   int isPartTime=2;
	   int isAbsent=0;
	   int wage=0;
	   int hours;
	   int totalhours=0;
	   int sumofsalary=0;
	   public void calcSalary(int wageperhour, int workingdays, int workinghourspermonth)
	   {
		   for (int i=0; i < workingdays; i++)
	       {
	       double attendance=Math.floor(Math.random()*10)%3;
	       int value = (int) attendance;
	       while(totalhours<90)
	       {
	       switch(value)
	       {
	       case 1:
	    	   if(totalhours<100)
	    	   {
	    	    hours=16;
	        	wage=wageperhour*hours;
	        	sumofsalary=sumofsalary+wage;
	        	totalhours=totalhours+hours;
	    	   }
	        	break;
	       case 2:
	    	   if(totalhours<100)
	    	   {
	    	   hours=6;
	        	wage=wageperhour*hours;
	        	sumofsalary=sumofsalary+wage;
	        	totalhours=totalhours+hours;
	    	   }
	        	break;
	       case 0:
	    	    sumofsalary=sumofsalary+wage;
	        	break;
	       }
	      }
	    }
		   
		 
		   System.out.println("Total Hours of Month:" + totalhours);
		   System.out.println("Total Monthly Salary (20 days) which include parttime,fulltime and absence is:" + sumofsalary);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		EmpWageUC8 infineon =  new EmpWageUC8();
		System.out.println("Enter wage for infineon :");
		int wageperhour=sc.nextInt();
		System.out.println("Enter number of working days for infineon :");
		int workingdays=sc.nextInt();
		System.out.println("Enter working hours per month for infineon :");
		int workinghourspermonth=sc.nextInt();
		infineon.calcSalary(wageperhour,workingdays,workinghourspermonth);
		EmpWageUC8 wipro =  new EmpWageUC8();
		System.out.println("Enter wage for wipro :");
		wageperhour=sc.nextInt();
		System.out.println("Enter number of working days for wipro :");
		 workingdays=sc.nextInt();
		System.out.println("Enter working hours per month for wipro :");
		 workinghourspermonth=sc.nextInt();
		wipro.calcSalary(wageperhour,workingdays,workinghourspermonth);
		   
	}
	
	
}
/*Output
Enter wage for infineon :
100
Enter number of working days for infineon :
30
Enter working hours per month for infineon :
100
Total Hours of Month:96
Total Monthly Salary (20 days) which include parttime,fulltime and absence is:9600
Enter wage for wipro :
120
Enter number of working days for wipro :
30
Enter working hours per month for wipro :
100
Total Hours of Month:90
Total Monthly Salary (20 days) which include parttime,fulltime and absence is:10800
*/