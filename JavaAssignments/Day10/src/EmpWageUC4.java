
public class EmpWageUC4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int isFullTime=1;
		   int isPartTime=2;
		   int isAbsent=0;
		   int wageperhour=20;
		   int totalhours;
		   int wage=0;
	       double attendance=Math.floor(Math.random()*10)%3;
	       int value = (int) attendance;
	       switch(value)
	       {
	       case 1:
	    	   totalhours=16;
	        	System.out.println("Employee is Full Time");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	break;
	       case 2:
	    	   totalhours=8;
	        	System.out.println("Employee is Part Time");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Part Time Day Wage:"+ wage);
	        	break;
	       case 0:
	    	   System.out.println("Employee is Absent");
	        	System.out.println("Day Wage:"+ wage);
	        	break;
	       }
	}

}
/*
 * Output 1:
Employee is Full Time
Full Time Day Wage:320
* Output 2:
Employee is Absent
Day Wage:0
* Output 3:
Employee is Part Time
Part Time Day Wage:160
*/