package ak;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number you want factorial");
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		factorial fac = new factorial();
		
	System.out.println(	fac.fact(s));
		
		
		
	}
           int fact(int s) {
        	   System.out.println("how many time if statement print");
    	   if(s==1) {
    		   return 1;
    	   }
    	   else {
    		  return s*fact(s-1);
    	   }
       }
}
