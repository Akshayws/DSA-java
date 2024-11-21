package p1;

import java.util.Scanner;

public class MagicSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of matrix: ");
		int n = sc.nextInt();
		int ar[][] = new int[n][n];
		int count = 1, x, y, r = n - 1, c = n / 2;
		while (count <= n * n) {             
			ar[r][c] = count;
			count++;
			x = r;
			y = c;
			r++;
			c--;
			if (r == n)
				r = 0;
			if (c < 0)
				c = n - 1;
			if (ar[r][c] != 0) {
				r = x - 1;
				c = y;
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
