package dsa.basicSorting;

public class insertionSort {
    // Utility function to print all elements in the array
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]  arr = {20, 3, 10, 5 , 2, 9, 12, 1};
        int n = arr.length;
        print(arr);  // Print the original unsorted array

        // Method 1: Using For Loop and break Condition

        // Insertion Sort
        //  Outer loop picks elements one by one from 1 to n-1
  /*      for(int i =  1; i <n; i++){
            //  Inner loop shifts elements greater than arr[i] to right
            for(int j = i; j >= 1; j--){
                if(arr[j] < arr[j - 1]){
                    // Swap if the current element is smaller than the previous
                    int temp = arr[j - 1];
                    arr[j - 1]= arr[j];
                    arr[j] = temp;
                }
                else{
                    break;  //Stop if the left element is already smaller
                }
            }
        }
   */

        // Method 2: Using For-Loop and While Loop

        for(int i =  1; i < n; i++) {
                int j = i;
                // Shift elements of the sorted part to the right to make space for insertion
                while (j >= 1 && arr[j] < arr[j - 1]) {
                    // Swap the current element with the one before it
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;   // Move to the previous position for comparison
                }
            }
        print(arr); // Print the sorted array
    }
}
