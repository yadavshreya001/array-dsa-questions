package dsa.questions;
/*

Question: Write a program to merge two sorted arrays.

 */
public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};     // First sorted array
        int[] arr2 = {2, 4, 6, 8, 10};   // Second sorted array
        int n1 = arr1.length;
        int n2 = arr2.length;

       // T.C: O(n1 + n2) , S.C:O(n1 + n2)
        int[] result = new int[n1 + n2];   // Result array to store merged elements
        int i = 0, j = 0, k = 0;    // i -> index for arr1, j -> index for arr2, k -> index for result

        // Traverse both arrays and pick a smaller element from current indexes
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of arr2, if any
        if(i == n1){
            while ( j < n2) {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        // Copy remaining elements of arr1, if any
        if(j == n2){
            while ( i < n1) {
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        // Print the merged sorted array
        for(int ele : result){
            System.out.print(ele + " ");
        }

    }
}
