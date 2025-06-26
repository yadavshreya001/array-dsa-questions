package dsa.questions;

/*
Question: Sort the array of 0’s and 1’s
*/

public class sortZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,0,1,0,0,1,0,1,0,0,0,0,1,0,1};
        int n = arr.length;

//  Method 1: Counting 0’s and 1’s and Overwriting the Array

        // Approach 1: Counting Zeros and Ones and then overriding array ,  T.C: O(n) and S.C: O(1)
   /*
        int countOfZeros = 0, countOfOnes = 0;
        // Count the number of 0's and 1's
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countOfZeros++;
            }else{
                countOfOnes++;
            }
        }
        // Fill the first 'countOfZeros' elements with 0
        for(int i = 0; i <= countOfZeros - 1; i++){
            arr[i] = 0;
        }
        // Fill the remaining elements with 1
        for(int i = countOfZeros; i < n; i++){
            arr[i] = 1;
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    */

 /*
      // Approach 2: Counting Zeros Only (Optimized Counting Approach) ,  T.C: O(n) and S.C: O(1)
        int countOfZeros = 0;  // Initialize a counter to keep track of number of 0's

        // Count the number of 0's in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countOfZeros++;
            }
        }
        // Fill the first 'countOfZeros' elements with 0
        for(int i = 0; i <= countOfZeros - 1; i++){
            arr[i] = 0;
        }
        // Fill the remaining elements with 1
        for(int i = countOfZeros; i < n; i++){
            arr[i] = 1;
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }
  */
        // Approach 3:  Counting Zeros Only (Single Loop Fill Optimization) ,  T.C: O(n) and S.C: O(1)
/*
        int countOfZeros = 0;  // Initialize a counter to keep track of number of 0's

        // Count the number of 0s in the input array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countOfZeros++;
            }
        }
        // Traverse the array again and fill values based on countOfZeros
                  //  - First 'countOfZeros' positions are filled with 0
                 //  - Remaining positions are filled with 1
        for(int i = 0; i < n; i++){
            if(i < countOfZeros){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }

 */

//  Method 2: Count the number of 0's and 1's in the array. Then, overwrite the original array with that many 0's followed by 1's.  (One- pass solution)

        //  Initialize two pointers: i starts from the beginning, j starts from the end
        int i = 0 , j = n-1;
        // Loop until the two pointers meet
        while(i < j) {
            if (arr[i] == 0) {
                i++;  // If left pointer is at 0, it's in correct position → move i forward
            } else if (arr[j] == 1) {
                j--;  // If right pointer is at 1, it's in correct position → move j backward
            } else {
                // If arr[i] == 1 and arr[j] == 0 → they are in wrong places → swap them
                // (arr[i] == 0 && arr[j] == 1)
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }


    }
}
