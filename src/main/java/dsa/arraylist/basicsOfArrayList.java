package dsa.arraylist;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(6);
        al.add(0, 10);  //   Adds element at specific index
        al.add(1, 20);
        al.add(2, 30);
        al.add(3, 40);
        al.add(4, 50);
        al.add(5,60);
      //  System.out.println(al.get(2));

       /*

        // Method 1: Using loop we can print all elements of arraylist
        for(int i = 0; i < al.size(); i++){
            System.out.print(al.get(i) + "  ");
        }

        */

        // Method 2: Using the Built-in feature of arraylist to print all elements
       System.out.println(al);

  //     System.out.println("Size of an ArrayList: " + al.size());

        al.set(2,100);   // Modify the value of element at particular index

        al.add(200);   //   Adds an element at the end bcz we have not specified any index
        System.out.println(al);

        System.out.println("Size of an ArrayList: " + al.size());


    }

}
