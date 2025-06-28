package dsa.questions;
/*

Question: Write a program to merge two sorted arrays.

 */
public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};     // First sorted array
        int[] arr2 = {2, 4, 6, 8, 10};   // Second sorted array

         // Method 1:  T.C: O(n1 + n2) , S.C:O(n1 + n2)
//        int n1 = arr1.length;
//        int n2 = arr2.length;

        // Result array to store merged elements of size n1 + n2
       // int[] result = new int[n1 + n2];

        // Pointers for traversing arr1, arr2, and result
        /*
        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for result
        */

        /*
         * Traverse both arrays simultaneously.
         * Compare current elements from both arrays.
         * Place the smaller one into result[k] and move the corresponding pointer.
         */
      /*
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i]; // Take element from arr1
                i++;
            } else {
                result[k] = arr2[j]; // Take element from arr2
                j++;
            }
            k++;
        }

       */

        /*
         * If we have reached the end of arr1,
         * Copy the remaining elements of arr2 to result.
         */
     /*
        if (i == n1) {
            while (j < n2) {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

      */

        /*
         * If we have reached the end of arr2,
         * Copy the remaining elements of arr1 to result.
         */
    /*
        if (j == n2) {
            while (i < n1) {
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        */

        // Print the final merged sorted array in ascending order
    /*
        System.out.println("Merged array in ascending order:");
        for (int ele : result) {
            System.out.print(ele + " ");
        }
     */


        // Method 2:  T.C: O(n1 + n2) , S.C:O(n1 + n2)
                int n1 = arr1.length;
                int n2 = arr2.length;

                // Result array to store merged elements in descending order
                int[] result = new int[n1 + n2];

                // Initialize pointers:
                int i = n1 - 1;         // Pointer at the end of arr1
                int j = n2 - 1;         // Pointer at the end of arr2
                int k = n1 + n2 - 1;    // Pointer at the end of result array

                /*
                 * Merge step:
                 * Compare elements from the end of arr1 and arr2.
                 * Place the larger of the two at the current position 'k' in result[].
                 * Decrement the respective pointers and move backward in result[].
                 */
                while (i >= 0 && j >= 0) {
                    if (arr1[i] >= arr2[j]) {
                        result[k--] = arr1[i--];
                    } else {
                        result[k--] = arr2[j--];
                    }
                }

                /*
                 * If any elements are left in arr1, copy them into result[].
                 * Since we're moving in reverse, decrement 'k' and 'i' accordingly.
                 */
                while (i >= 0) {
                    result[k--] = arr1[i--];
                }

                /*
                 * Similarly, copy remaining elements from arr2 (if any).
                 */
                while (j >= 0) {
                    result[k--] = arr2[j--];
                }

                // Print the merged result array, which is in descending order
                System.out.println("Merged array in descending order:");
                for (int ele : result) {
                    System.out.print(ele + " ");
                }
            }
        }


