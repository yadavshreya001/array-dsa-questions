package dsa.array;

/*

Question: Given an array of marks of students, if the mark of any student is less than 35 print its roll number.
[ roll number here refers to the index of the array ].

*/

public class rollnumber {
    public static void main(String[] args) {
        int[] arr = {100, 20, 340, 40 ,30 , 600, 3, 1 , 7 , -5, 3, 23, 45, 67, 90, 200, 234, 34, 31 };

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 35){
                System.out.print(i + " ");
            }
        }
    }
}
