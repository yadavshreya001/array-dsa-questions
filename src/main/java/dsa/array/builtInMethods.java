package dsa.array;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {

        int[] arr = {100,220,30,240,50,23};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        // Using For-each loop instead of for loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }



        // Sorting an array using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Using For-each loop instead of for loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
