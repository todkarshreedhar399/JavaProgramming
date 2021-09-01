package Part2;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int[][] arr;
        System.out.println("Enter the rows:");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the columns:");
        int n=Integer.parseInt(sc.nextLine());
        arr=new int[m][n];
        twodimensionalarray(arr, m, n);
        
	}
	static void twodimensionalarray(int[][] arr,int m , int n)
	{
		Scanner sc=new Scanner(System.in);
		
        for (int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		System.out.println("Enter the element row "+ i + " column "+j );
        	    arr[i][j]=Integer.parseInt(sc.nextLine());
        	}
        }
        System.out.println("Multidimensional array is as follows:");
        for (int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		System.out.print(arr[i][j]+"\t");
        	    
        	}
        	System.out.println();
        }
	}

}
/*Output
 Enter the rows:
2
Enter the columns:
2
Enter the element row 0 column 0
1
Enter the element row 0 column 1
2
Enter the element row 1 column 0
3
Enter the element row 1 column 1
4
Multidimensional array is as follows:
1	2	
3	4	
 */
