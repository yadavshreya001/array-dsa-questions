package dsa.questions;

/*
 Question: Find the Next Greatest Element for every element in an array.
 */

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;

        // Method 1: Brute Force Approach for Next Greatest Element --> T.C: O(n²)  and S.C: O(n)
/*
        int [] res = new  int[n];  // Output array to store the result
        res[n-1] = -1;    // The last element has no next element, so we set it to -1
        // Traverse the array from start to n-2
        for(int i = 0; i < n-1; i++){
            int maxArr = Integer.MIN_VALUE;  // Initialize maxArr with the smallest possible integer value
            // Traverse the sub-array to the right of the current element
            for(int j = i+1; j < n; j++){
                maxArr = Math.max(maxArr, arr[j]);
            }
            res[i] = maxArr; // Store the next greatest element in the result array
        }
        // Print the result array
        for(int ele : res){
            System.out.print(ele + " ");
        }
 */

        // Method 2: Optimized Approach (Right to Left Traversal , T.C: O(n) and S.C: O(n)

        // Initialize nge with the last element (it will be the first "next greatest" for the element before it)
        int nge = arr[n - 1];
        int[] ans = new  int[n];  // Output array to store the result
        // Traverse from the second last element to the start
        for(int i = n-2; i >= 0; i--){
            ans[i] = nge;   // Store the current next greatest for position i
            nge = Math.max(nge, arr[i]);  // Update the next greatest element for the next iteration
        }
        // Note: The last element has no next element, so we set it to -1
        ans[n - 1] = -1;

        // Print the result array
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
