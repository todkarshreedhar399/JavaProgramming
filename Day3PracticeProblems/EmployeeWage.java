
public class EmployeeWage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int isFullTime=1;
		   int isPartTime=2;
		   int isAbsent=0;
		   int wageperhour=20;
		   int totalhours;
		   int wage=0;
	        double attendance=Math.floor(Math.random()*10)%3;
	        if (attendance == isFullTime)
	        {
	        	totalhours=16;
	        	System.out.println("Employee is Full Time");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	
	        }
	        else if (attendance == isPartTime)
	        {
	        	totalhours=8;
	        	System.out.println("Employee is Part Time");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Part Time Day Wage:"+ wage);
	        	
	        }
	        else 
	        {
	        	System.out.println("Employee is Absent");
	        	System.out.println("Day Wage:"+ wage);
	        	
	        }
	}

}
/*Output:
 * output1:
 Employee is Full Time
 Full Time Day Wage:320
 * output2:
 Employee is Part Time
 Part Time Day Wage:160
 * output3:
 Employee is Absent
 Day Wage:0
 */
