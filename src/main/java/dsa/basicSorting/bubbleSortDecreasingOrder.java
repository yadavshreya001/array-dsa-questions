package dsa.basicSorting;

// Question: Sort a given array in decreasing order using bubble sort

public class bubbleSortDecreasingOrder {
    // Utility function to print all elements in the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {20, 3, 10, 5 , 2, 9, 12, 1};
        int n = arr.length;
        print(arr);

        // Method 1: Bubble Sort - Optimized Bubble Sort (Reduced Comparisons)

        // Outer loop for passes
   /*     for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparison
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the left element is smaller than the right (for descending)
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    */

        // Method 2: Bubble Sort - Optimized Version (Reduced Comparisons with Early Exit)

        for(int i = 0; i < n-1 ; i++){
            // Initialize the flag to true at the start of each pass
            // It helps detect whether the array is already sorted
            boolean flag = true;

            // Inner loop to compare adjacent elements
            // Range reduces after each pass, since last k elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    // Since a swap occurred, the array wasn't sorted — set the flag to false
                    flag = false;
                }
            }
            // If no swaps happened in the inner loop, the array is sorted — exit early
            if(flag == true){
                break;
            }
        }
        print(arr);
    }
}
