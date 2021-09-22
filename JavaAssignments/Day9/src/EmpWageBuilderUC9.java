import java.util.Scanner;

public class EmpWageBuilderUC9 {
	
	public static void main(String[] args) {
		
		   
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		EmpWageUC9 infineon =  new EmpWageUC9();
		System.out.println("Enter wage for infineon :");
		infineon.wageperhour=sc.nextInt();
		System.out.println("Enter number of working days for infineon :");
		infineon.workingdays=sc.nextInt();
		System.out.println("Enter working hours per month for infineon :");
		infineon.workinghourspermonth=sc.nextInt();
		infineon.calcSalary();
		EmpWageUC9 wipro =  new EmpWageUC9();
		System.out.println("Enter wage for wipro :");
		wipro.wageperhour=sc.nextInt();
		System.out.println("Enter number of working days for wipro :");
		wipro.workingdays=sc.nextInt();
		System.out.println("Enter working hours per month for wipro :");
		wipro.workinghourspermonth=sc.nextInt();
		wipro.calcSalary();
		   
	}
}
