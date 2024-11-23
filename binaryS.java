package ak;

public class binaryS {

    public static void main(String[] args) {
        int arr[] = {99,45,21,20,16,15,10,9,8};
        int target = 8;
        System.out.println(AorderAgnosticBS(arr, target));
    }

    static int AorderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAcc = arr[start]<arr[end];
        
      //Acceding
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
           if(arr[mid]==target) { //mid equal to target
        	  return mid;
           }       if(isAcc) {
        	   
            if (target <arr[mid]) {
                end= mid - 1;
            } else {
                start = mid + 1;
            }
        }
       else {//Descending 
    	   if(target>arr[mid]) {
    		   end= mid-1;
    	   }
    	   else {
    		   start =mid+1;
    		   
    	   }
       }
        }
        return -1;
        
        }   
       
}