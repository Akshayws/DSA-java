package ak;

class Rcurstion {
    public boolean isPalindrome(int x) {
        // Check for negative numbers and numbers ending with 0 but not 0 itself
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
    	 Rcurstion sol = new  Rcurstion();
        int number = 123;
        if (sol.isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

