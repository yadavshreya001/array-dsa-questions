package dsa.arraylist;

import java.util.ArrayList;

public class addInArraylists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al + " " + al.size());
        al.add(200);
        System.out.println(al + " " + al.size());
        al.add(300);
        System.out.println(al + " " + al.size());
        al.add(400);
        System.out.println(al + " " + al.size());
        al.add(500);
        System.out.println(al + " " + al.size());
        al.add(600);
        System.out.println(al + " " + al.size());

        al.remove(3);
        System.out.println(al + " " + al.size());
    }
}
