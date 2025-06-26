package dsa.questions;

/*
Question: Write a program to reverse a part of the array without using any extra array.

 */

public class reversePartOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int n = arr.length;

        int start = 1 , end = 5 ;    //  Initialize to reverse a part of an array

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

