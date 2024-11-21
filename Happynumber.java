package p1;

import java.util.Scanner;

public class Happynumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (start end):");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Loop through the range to find happy numbers
        for (int i = start; i <= end; i++) {
            int iter = finditer(i);

            if (iter != -1) {
                System.out.println(i + "  " + iter);
            }
        }

        sc.close();
    }

    public static int finditer(int num) {
        int count = 1;

        // Iterate until the number becomes 1 or the count exceeds 10
        while (num != 1 && count < 10) {
            num = sumofSquare(num);
           ++ count;
        }

        if (num == 1) {
            return count;
        } else {
            return -1; // Number didn't reach 1 within 10 iterations
        }
    }

    public static int sumofSquare(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
