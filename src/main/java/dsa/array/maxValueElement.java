package dsa.array;

/*

Question: Find the maximum value out of all the elements in the array.

 */

public class maxValueElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 60, 89, 100, 345, 674, -23};
        int n = arr.length;

  /*   // Method 1: Starting loop from 1 till n-1  Using for loop
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value is: " + max);

   */


/*
        // Method 2: Starting loop from 0 till n-1 Using for loop
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            max = Math.max(max, arr[i]);
        }
        System.out.println("Maximum value is: " + max);

 */

        // Method 3: Starting loop from 0 till n-1 Using for loop, but using Math.max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Maximum value is: " + max);
    }
}
