package dsa.questions;

/*
Question: Sort the array of 0’s , 1’s and 2's.
*/

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 2, 0, 1, 2, 0, 2, 1, 1, 2, 0, 0};
        int n = arr.length;

//        Method 1: Counting 0’s and 1’s and Overwriting the Array (Two-pass solution)

        // Approach 1: Counting Zero's , One's and Two's and then overriding array ,  T.C: O(n) and S.C: O(1)
/*
        int countOfZeros = 0, countOfOnes = 0, countOfTwos = 0;
        // Count the number of 0's, 1's and 2's
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countOfZeros++;
            } else if (arr[i] == 1) {
                countOfOnes++;
            } else if (arr[i] == 2) {
                countOfTwos++;
            }
        }
        // Fill the first 'countOfZeros' elements with 0
        for (int i = 0; i < countOfZeros; i++) {
            arr[i] = 0;
        }
        // Fill the second 'countOfOnes' elements with 1
        for (int i = countOfZeros; i < (countOfZeros + countOfOnes); i++) {
            arr[i] = 1;
        }
        // Fill the remaining elements with 2
        for (int i = (countOfZeros + countOfOnes); i < n; i++) {
            arr[i] = 2;
        }
        // Print the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

 */

/*
        // Approach 2: Counting Zero's and One's Only (Single Loop Fill Optimization) ,  T.C: O(n) and S.C: O(1)

        int countOfZeros = 0 ,  countofOnes = 0 ;  // Initialize a counter to keep track of number of 0's

        // Count the number of 0's and 1's in the input array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countOfZeros++;
            }
            if(arr[i] == 1){
                countofOnes++;
            }
        }
        // Overwrite array based on counts
        for(int i = 0; i < n; i++){
            if(i < countOfZeros){
                arr[i] = 0;  // Fill 0s first
            }else if(i  < (countOfZeros + countofOnes) ) {
                arr[i] = 1;  // Then fill 1s
            }
            else{
                arr[i] = 2;  // Remaining positions get 2s
            }
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }

 */

        /** Method 2:
         * This class demonstrates the Dutch National Flag algorithm to sort an array
         * consisting only of 0s, 1s, and 2s in a single pass with constant space.
         *
         * Dutch National Flag Algorithm (3-pointer approach), Time Complexity: O(n), Space Complexity: O(1)
        */

        int lo = 0;           // Pointer for 0s
        int mid = 0;          // Current element pointer
        int hi = n - 1;       // Pointer for 2s
        // Traverse the array
        while (mid <= hi) {
            // Swap arr[lo] and arr[mid], increment both
           if (arr[mid] == 0) {
               int temp = arr[lo];
               arr[lo] = arr[mid];
               arr[mid] = temp;
               lo++;
               mid++;
            }
           else if (arr[mid] == 1) {
                mid++; // Move mid pointer ahead for 1
            }
            else {
                // if (arr[mid] == 2)
               // Swap arr[mid] and arr[hi], decrement hi only
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi--;
            }
        }
        // Print the sorted array
        for(int ele: arr){
            System.out.print(ele + " ");
        }

    }
}
