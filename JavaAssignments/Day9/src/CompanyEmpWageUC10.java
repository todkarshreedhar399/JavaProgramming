
public class CompanyEmpWageUC10 {
	String name;
	int isFullTime=1;
	   int isPartTime=2;
	   int isAbsent=0;
	   int wage=0;
	   int hours;
	   int totalhours=0;
	   int sumofsalary=0;
	   int wageperhour,  workingdays, workinghourspermonth;
	   public void calcSalary()
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
}
