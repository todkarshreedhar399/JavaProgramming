
public class EmployeeWage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int isFullTime=1;
		   int isPartTime=2;
		   int isAbsent=0;
		   int wageperhour=20;
		   int hours;
		   int totalhours=0;
		   int wage=0;
		   int sumofsalary=0;
		   for (int i=0; i < 20; i++)
	       {
	       double attendance=Math.floor(Math.random()*10)%3;
	       int value = (int) attendance;
	       switch(value)
	       {
	       case 1:
	    	   hours=16;
	        	wage=wageperhour*hours;
	        	sumofsalary=sumofsalary+wage;
	        	totalhours=totalhours+hours;
	        	break;
	       case 2:
	    	   hours=8;
	        	wage=wageperhour*hours;
	        	sumofsalary=sumofsalary+wage;
	        	totalhours=totalhours+hours;
	        	break;
	       case 0:
	    	    sumofsalary=sumofsalary+wage;
	        	break;
	       }
	       if(totalhours>=100)
	    	   break;
	    }
		   System.out.println("Total Hours of Month:" + totalhours);
		   System.out.println("Total Monthly Salary (20 days) which include parttime,fulltime and absence is:" + sumofsalary);
	}


}

/*Output:
o1:Total Hours of Month:104
Total Monthly Salary (20 days) which include parttime,fulltime and absence is:2720
o2:Total Hours of Month:104
Total Monthly Salary (20 days) which include parttime,fulltime and absence is:3520
*/
