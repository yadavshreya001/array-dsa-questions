package dsa.questions;

/*
Question: Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)
 */

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,0,8,5,4,9,2};
        int target = 9;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
