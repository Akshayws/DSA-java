package ak;

import java.util.Scanner;

public class PelindromResursion {
	  
	public static boolean isPelindrom(String input) {
		
		
		return isPalindromeRecursive(input, 0, input.length() - 1);
	}
	public static boolean isPalindromeRecursive(String input, int start, int end) {
		if(start>=end) {
			return true;
		}
		if(input.charAt(start)!=input.charAt(end)) {
			return false;
			
		}
		return isPalindromeRecursive(input, start + 1, end - 1);
	}
	
     public static void main(String[] args) {
    	 System.out.println("Enter the String ");
    	 Scanner sc= new Scanner (System.in);
    	 String  input = sc.next();
    	
    	 if (isPelindrom(input))
    	 {
    		 System.out.println("is Pelindrom");
    	 }
    	 else {
    		 System.out.println("Is not pelindrom");
    	 }
		
	}
	
	
}
