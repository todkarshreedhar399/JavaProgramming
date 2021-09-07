import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = false;
		System.out.println("Enter your range");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		if(num == 0 || num == 1) {
			System.out.println(num+ " is not a prime number");
		}
		else {
			for (int i = 2; i <= num/2; i++) {
				if (num%i == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
			System.out.println(num+ " is a prime");
			}
			else
				System.out.println(num+ " is not a prime");
			}
	}
}
