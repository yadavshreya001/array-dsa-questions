package dsa.basicSorting;

//Question: Sort a given Array in increasing order using selection sort, but in each pass, put the kth maximum element at the right position.

public class selectionSortKthMaxEleRight {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        /*
        - Problem Summary:
           * Sort an array in increasing order using selection sort, but in each pass, place the k-th maximum element at its correct position from the end.

        - Basic Selection Sort
            * In standard selection sort (for increasing order):
            * We find the minimum element from the unsorted part.
            * Place it at the beginning (left to right).
            * So after k passes, we have k minimum elements at the start.

        - Modified Selection Sort (Your Question)
            * In each pass, instead of finding the minimum, we find the maximum and put it at the end of the current unsorted portion.

        - Intuition Behind This Logic
            * This version just inverts the direction: instead of building the sorted array from left to right with minimums, you're building from right to left with maximums.
            * The Result is still increasing order but through maximum extraction instead of the minimum.

        Example: It's like emptying a room of the tallest people first, placing them at the far end, so the shortest naturally remain in front.
        */

        int[] arr = {20, 3, 10, 5 , 2, 9, 12, 1};
        int n = arr.length;
        print(arr);

        // Traverse the array from end to start
        for (int i = n - 1; i > 0; i--) {
            // Find the maximum element in arr[0..i]
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the max element with the element at index i
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        print(arr);
    }
}
