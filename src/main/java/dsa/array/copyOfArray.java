package dsa.array;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {

/*

         // Shallow Copy

        int[] arr = {10, 20, 30, 40 ,50 , 60};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] nums = arr;  // Shallow copy
        nums[0] =  70;
        for(int ele : nums){
            System.out.print(ele + " ");
        }

 */

        // Deep Copy

        int[] arr = {10, 20, 30, 40 ,50 , 60};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

 /*    //Method 1: Deep Copy using Built-in function
        int nums[] = Arrays.copyOf(arr, arr.length);
        nums[0] =  90;
        for(int ele : nums){
            System.out.print(ele + " ");
        }
  */

        // Method 2: Deep Copy using a manual loop
        int[] nums = new int[arr.length];   // Creates a new array with the same length as 'arr'
        for(int i = 0; i < arr.length; i++){
            nums[i] = arr[i];   // Copies each element individually from 'arr' to 'nums'
        }
        nums[1] = 345;
        for(int ele : nums){
            System.out.print(ele + " ");
        }

    }
}
