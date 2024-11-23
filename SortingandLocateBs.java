package ak;

import java.util.Scanner;

public class SortingandLocateBs {

    // Function to sort the array using Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) break;
        }
    }

    // Function to perform Binary Search and return the index and count of comparisons
    static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start <= end) {
            count++;
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
            	System.out.println(mid);
                System.out.println("Number of comparisons: " + count);
                return mid;
            }
            if (arr[mid] < n)
                start = mid + 1;
            else
                end = mid - 1;
        }

        System.out.println("Number of comparisons: " + count);
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the limit");
       int n=sc.nextInt();

        // Input the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <arr.length;i++) {
            arr[i] = sc.nextInt();
        }

      
        System.out.println("Enter the number to be located:");
        int m = sc.nextInt();
        bubbleSort(arr);

        int index = binarySearch(arr, m);
       
        sc.close();
    }
}
