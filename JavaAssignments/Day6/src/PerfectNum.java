import java.util.Scanner;

public class PerfectNum {
public static void main(String[] args) {
	perfect();
}
static void perfect()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number: ");
	int n = sc.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0) {
			sum=sum+i;
			
		}
	}
	System.out.println("Number is: "+n);
	if(sum==n)
	System.out.println("Perfect Num");
	else
	System.out.println("Not a Perfect Num");
}
}
