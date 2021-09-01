package Part2;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[];
        array=new int[3];
        int i=0;
        int j=1;
        int k=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a[i]:");
        array[i]=Integer.parseInt(sc.nextLine());
        System.out.println("Enter value for a[j]:");
        array[j]=Integer.parseInt(sc.nextLine());
        System.out.println("Enter value for a[k]:");
        array[k]=Integer.parseInt(sc.nextLine());
        if(array[i]+array[j]+array[k]==0)
		{
        	System.out.println(array[i]+ " + "+array[j]+" + "+array[k] + " =0");
		}else if(array[i]-array[j]+array[k]==0)
		{
			System.out.println(array[i]+ " - "+array[j]+" + "+array[k] + " =0");
		}else if(array[i]-array[j]-array[k]==0)
		{
			System.out.println(array[i]+ " - "+array[j]+" - "+array[k] + " =0");
		}else if(array[i]+array[j]-array[k]==0)
		{
			System.out.println(array[i]+ " + "+array[j]+" - "+array[k] + " =0 ");
		}else {
			System.out.println("Sum of Three integers cant be 0.");
		}
	}

}
/*Output:
Enter value for a[i]:
5
Enter value for a[j]:
2
Enter value for a[k]:
3
5 - 2 - 3 =0
*/