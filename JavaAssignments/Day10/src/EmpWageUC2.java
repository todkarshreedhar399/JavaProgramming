

public class EmpWageUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int isPresent=1;
		   int wageperhour=20;
		   int totalhours=8;
		   int wage=0;
	        double attendance=Math.floor(Math.random()*10)%2;
	        if (attendance == isPresent)
	        {
	        	System.out.println("Employee is Present");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	
	        }
	        else 
	        {
	        	System.out.println("Employee is Absent");
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	
	        }
	}

}
/*Output:
 Output1: 
  Employee is Present
  Full Time Day Wage:160
 Output 2:
  Employee is Absent
  Full Time Day Wage:0   
*/