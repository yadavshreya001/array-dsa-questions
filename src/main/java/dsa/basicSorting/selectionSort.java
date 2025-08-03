package dsa.basicSorting;

public class selectionSort {
    // Utility function to print all elements in the array
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]  arr = {20, 3, 10, 5 , 2, 9, 12, 1};
        int n = arr.length;

        /**
         * Selection Sort works as follows:
         * Divide the array into a sorted and an unsorted part.
         * Repeatedly find the smallest (or largest, for descending order) element from the unsorted part.
         * Swap it with the first element of the unsorted part, growing the sorted part by one.
         * Repeat this process for each position in the array until the whole array is sorted.
         *
         * Time Complexity = O(n²) (but reduced compared to the naive version)
         * Space Complexity = O(1)
         */

        print(arr);
        // Selection Sort Algorithm
        // Move the boundary of unsorted subarray one by one
        for(int i =  0; i <n-1; i++){
            int  min = Integer.MAX_VALUE; // Initialize minimum value
            int minIndex = -1;  // Initialize index of minimum element
            // Find the minimum element in the unsorted array
            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        print(arr); // Print the sorted array
    }
}
