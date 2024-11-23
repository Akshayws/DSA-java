package ak;

import java.util.Scanner;

public class Happynumber {
	static void happy(int n) {
		int temp = n;
		int count = 1;

		for (int i = 0; i <= 10; i++) {
			int sum = 0;count++;
			while (n != 0) {
				
				
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;

			

			}
			n=sum;
			if (sum == 1) {
				System.out.println(temp + " " + count);break;

			}
			

		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Start:");
		int x = sc.nextInt();
		System.out.println("End:");
		int y = sc.nextInt();
		for (int i = x; i <= y; i++) {
			happy(i);
		}
	}

}
