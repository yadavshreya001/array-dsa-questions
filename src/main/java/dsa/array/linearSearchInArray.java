package dsa.array;

/*

Question: Find the element ‘x’ in the array. Take an array and x as input

*/

import java.util.Scanner;

public class linearSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target element: ");
        int x = sc.nextInt();
        System.out.println("Enter the size of an array: ");
        int  n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");

        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }

        boolean flag = false;  // false means not found
        for (int i = 0; i < n; i++) {
            if(arr[i] == x) {
                flag = true;  // true means not found
                break;
            }
        }
        if(flag == true){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found");
        }

    }
}
