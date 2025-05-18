package dsa.array;

/*

Question: Find the minimum value out of all the elements in the array.

 */

public class minValueElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 60, 89, 100, 345, 674, 23 , 5 , 1};
        int n = arr.length;

/*
          // Method 1: Starting loop from 1 till n-1  Using for loop
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is: " + min);

 */

/*
        // Method 2: Starting loop from 0 till n-1 Using for loop
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            min = Math.max(min, arr[i]);
        }
        System.out.println("Minimum value is: " + min);

 */


        // Method 3: Starting loop from 0 till n-1 Using for loop, but using Math.max
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Minimum value is: " + min);


    }
}
