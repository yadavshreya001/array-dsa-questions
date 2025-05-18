package dsa.array;
/*

Question: Find the second-largest element in the given Array.

 */

import java.util.Arrays;

public class secondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 60, 89, 100, 345, 674, 23};
        int n = arr.length;
/*
       //Method 1: Using 2 loops approach
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] != max) {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        System.out.println("Second Maximum value is: " + secondMax);

 */
        // Method 2: Using Arrays.sort()
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        Arrays.sort(arr);
        int max = arr[n - 1];
        // Traverse backwards to find the second distinct maximum
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < max) {
                System.out.println("Second Maximum value is: " + arr[i]);
                return;
            }
        }
        System.out.println("No second maximum. All elements are equal.");

    }
}
