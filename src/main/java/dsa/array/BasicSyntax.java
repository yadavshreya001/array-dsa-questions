package dsa.array;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {

//        int[] arr =new int[5];

        // initializing individual element
/*
        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        arr[4] =50;
 */

/*
        //  We can also initialize an array like this:
        int[] arr = {10, 20, 30, 40 ,50 };
        System.out.println(arr[2]);
 */

      // Method 1: Printing individual element of array using -> System.out.print
/*
         // output of an array element
        System.out.println(arr[0] + " ");
        // update the value of an array
        arr[0] =103;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");

 */


       //  Method 2: Printing element of an array using -> Loop
/*
        // output using Loop in single go
        for(int i = 0; i <=4; i++){
            System.out.print(arr[i] + " ");
        }
 */

/*
        // Method 3: Printing element of an array using -> Loop but with User input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new  int[n];
        System.out.println("Enter array elements: ");
        // input loop
        for(int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }

        // output loop
        for(int i = 0; i <= n-1; i++){
            System.out.print(arr[i] + " ");
        }
 */

 /*
        // Method 4: We can also initialize an array like this and print output using loop
        int[] arr = {10, 20, 30, 40 ,50 , 60};
        for(int  i = 0; i <= 5; i++){
            System.out.print(arr[i] + " ");
        }

  */

        // Method 5: If we don't know the size of the array, and we have to print it then we can use array.length :
        int[] arr = {10, 20, 30, 40 ,50 , 60, 3, 1 , 7 , -5, 3, 23, 45, 67, 90, 200, 234, 34, 31 };
        int n = arr.length;
        for(int  i = 0; i <= n - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
