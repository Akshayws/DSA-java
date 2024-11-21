package p1;

import java.util.Scanner;

public class linkedlist {

	public static void main(String[] args) 
	
	{  Scanner sc=  new Scanner(System.in);
	   System.out.println("Enter the rows:");
	 
	   int r = sc.nextInt();
	   System.out.println("Enter the col:");
	   int c = sc.nextInt();
	   System.out.println("Enter the elements:");
	   
	   int [][] max = new int[r][c];

	   for(int i =0; i<r;i++) {
		   for (int j=0;j<c;j++) {
			 //System.out.println("i:"+i+" j:"+j);
			   max [i][j]=sc.nextInt();
			   
			   
			  
		   }

	   }
	   System.out.println(r+" "+c);
	   for(int[] row: max) {
			  for (int e:row) {
			     
				  System.out.print(e+" ");
				  
			  }
			  System.out.println();
			  
		  }
	   for(int i =0; i<r;i++) {
		   for (int j=0;j<c;j++) {
			 //System.out.println("i:"+i+" j:"+j);
			  if( max [i][j]==0) {
				  
			  }
				  
			  }
			  
		   }

	   }
	   
	   }

	
	


