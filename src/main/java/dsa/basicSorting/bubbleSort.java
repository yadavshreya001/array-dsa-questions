package dsa.basicSorting;

public class bubbleSort {
    // Utility function to print all elements in array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 90, 30};
        int n = arr.length;
        print(arr);   // Print the original array

        // Method 1: Bubble Sort - 1
         /*
            Number of operations = (n - 1)²
                                 = n² - 2n + 1

            Time Complexity = O(n²)
            Space Complexity = O(n)   , Auxiliary Space = O(1)
           */

/*
        // Outer loop for number of passes (should usually run n-1 times)
        for(int k = 1; k <= n-1 ; k++){
            // Inner loop for comparing adjacent elements in the current pass
            for (int i = 0; i < n - 1; i++) {
                // If the left element is greater, swap with the right
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
            print(arr); // Print the sorted array
        */


        // Method 2: Bubble Sort - 2  -->  Optimized Bubble Sort (Reduced Comparisons)

         /*
            Number of operations = (n-1) + (n-2) + ... + 1
                                 = n(n - 1)/2

            Time Complexity = O(n²) (but reduced compared to the naive version)
            Space Complexity = O(n)   , Auxiliary Space = O(1)
          */

        /*Idea:
        Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order. In each pass, the largest unsorted element "bubbles up"
        to its correct position at the end of the array.
        This version reduces unnecessary comparisons by skipping already sorted elements at the end after each pass.
        */

        // Outer loop to control the number of passes through the array
        // We need (n-1) passes for n elements to sort completely
        for(int k = 0; k < n-1 ; k++){
            // Inner loop to compare adjacent elements
            // After each pass, the largest element settles at the end,
            // so we can reduce the comparison range by 'k'
            for (int i = 0; i < n - 1 -  k; i++) {
                // If the current element is greater than the next, swap them
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        // After all passes, the array is sorted in ascending order
        print(arr); // Print the sorted array


        }


    }



