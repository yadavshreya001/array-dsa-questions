package dsa.questions;

/*

Question: Write a program to reverse the array without using any extra array.

 */

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int n = arr.length;

        /*

        // Method 1: reverses the array without using extra space, by swapping elements from the start and end
        for (int i = 0; i < n / 2; i++) {   // Loop starts from beginning to middle of the array
            int j = n - i - 1;        // Calculate the corresponding index from the end
            int temp = arr[i];       //  Swap elements
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // printing elements of an array
        for (int element : arr) {
            System.out.print(element + " ");
        }

         */


        // Method 2: In-place array reversal using the two-pointer technique
        int start = 0, end = n - 1 ;  //  Initialize two pointers: start at 0, the end at last index

        //  Continue swapping while start is less than the end
        while(start <= end){
            int temp = arr[start];        // Store value at start index
            arr[start] = arr[end];   // Replace a start element with an end element
            arr[end] = temp;        // Replace end element with stored value
          // Move start forward and end backward
            start++;
            end--;

        }
        // printing elements of an array
        for(int element: arr){
            System.out.print(element + " ");
        }
    }

}
