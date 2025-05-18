package dsa.array;

/*

Question: Calculate the sum of all the elements in the given array.

 */
public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = {10,20,35,60,89};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
