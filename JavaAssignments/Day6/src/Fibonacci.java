import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
	Fibonacci();
	
    }
	static void Fibonacci() {
		int a=0;
		int b=1;
		System.out.println("Enter Range:");
		Scanner sc= new Scanner(System.in);
		int range = sc.nextInt();
		int temp;
		System.out.println("Fibonaci Seriesc");
		System.out.print(a + "\t" +b);
		while(b<range)
		{   temp=a;
			a=b;
		    b=temp+b;
			if(b<range)
			System.out.print("\t"+ b);
		}
	}
}
