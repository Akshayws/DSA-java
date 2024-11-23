package ak;

public class BubbleSort {
	
	static void bubblesort(int arr[]) {
		int temp;
		boolean swaped;
		for(int i=0;i<arr.length-1;i++) {
			swaped =false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swaped= true;
				}
				
			}
			if(swaped==false) 
				break;
			}
		}
		static void printarr(int arr[]) {
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {67,12,33,56,90,10};
		bubblesort(arr);
		System.out.println("sorted array:");

		printarr(arr);
		

	}

}
