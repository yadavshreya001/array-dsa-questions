package dsa.questions;

/*

Question:Rotate the given array ‘a’ by k steps, where k is non-negative.

 */

public class rotateTheArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int n = arr.length;
        int k = 9;
        k = k % n;  // Ensure k is within array bounds

        /*

        // Method 1: Right Rotation using Extra Array

        // Create a new array to store the rotated result
        int[] result = new int[n];

        //  Copy the last 'k' elements to the beginning of result[]
        int j = 0;
        for(int i = n-k; i <= n-1; i++){
            result[j] = arr[i];
            j++;
        }

        // Copy the first 'n-k' elements after the last k elements
        for(int i = 0; i <= n-k-1; i++){
            result[j] = arr[i];
            j++;
        }

       // Print the rotated array
        for(int ele : result){
            System.out.print(ele + " ");
        }

         */

        // Method 2: Right Rotation using an In-place array

    }
}
