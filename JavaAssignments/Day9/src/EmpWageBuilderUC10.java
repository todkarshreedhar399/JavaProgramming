import java.util.Scanner;

public class EmpWageBuilderUC10 {

	public static void main(String[] args) {
		
		   
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		CompanyEmpWageUC10[] obj = new CompanyEmpWageUC10[50];
		System.out.println("Enter the number of companies you want to calculate monthly wage for:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		obj[i]=new CompanyEmpWageUC10();	
		System.out.println("Enter name of Firm  :");
		obj[i].name=sc.next();
		System.out.println("Enter wage  :");
		obj[i].wageperhour=sc.nextInt();
		System.out.println("Enter number of working days :");
		obj[i].wageperhour=sc.nextInt();
		System.out.println("Enter working hours per month :");
		obj[i].workinghourspermonth=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			
		System.out.println("Name of Firm  :" + obj[i].name);
		System.out.println("Enter wage  :" + obj[i].wageperhour);
		System.out.println("Number of working days :" + obj[i].wageperhour);
		System.out.println("Working hours per month :" + obj[i].workinghourspermonth);
		obj[i].calcSalary();
		}
		   
	}
}
