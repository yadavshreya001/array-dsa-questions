package dsa.basicSorting;

/*
Question: Check if an array is sorted in ascending order.
*/

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {10, 200, 30, 40, 50, 60};
        int n = arr.length;
        // Initialize a boolean flag to true. This will help determine if the array is sorted.
        boolean flag = true;

        // Loop through the array elements from index 0 to n-2
        for(int i = 0; i < n-1; i++){
            // Check if the current element is greater than the next element
            if(arr[i] > arr[i+1]){
                System.out.println("Array is Unsorted");
                flag = false;   // Set the flag to false since the order is incorrect
                break;
            }
        }
        // If the flag is still true after the loop, then the array is sorted
        if(flag == true){
            System.out.println("Array is Sorted");
        }

    }
}
