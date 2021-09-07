import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumber {

	public static void main(String[] args) {
		int flag = 0;
		System.out.println("Enter how many coupons you want to generate");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int array [] = new int [times];
		int couponNumber;
		for (int i = 0; i < times; i++) {
			couponNumber = (int) ThreadLocalRandom.current().nextInt(10,20);
			array[i] = couponNumber;
			System.out.println(array[i]);
			for (int j = 0; j < i; j++) {
				if(array[j] == array[i]) {
					System.out.println("same coupon number user lost");
					flag=0;
				}
				else
					flag = 1;
			}
			
		}
		if (flag == 1) {
				System.out.println("coupon is unique");
			}
	}

}
