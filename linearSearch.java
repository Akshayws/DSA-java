package ak;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {34,55,66,71,24,77,32,21,56};
		System.out.println("Enter the number you want to search:");
        Scanner sc = new Scanner(System.in);
        int locate = sc.nextInt();
       
         int counter =0 ;
         
          boolean found = true ;
          for (int i=0;i<arr.length;i++)
          {
        	  counter++;
        	  if (locate==arr[i]) {
        		  System.out.println("located "+arr[i]);
        		  found=true;
        		  break;
        		  
        	  }
        
          }  System.out.println("Found! in number of iterations to located the element:"+counter);
          
        
	     

	}

}
