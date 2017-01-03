package Loops;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html

        int count1 = 1; //Might not run if while condition is not true.
        while (count1 < 11) {
            System.out.println("Count In The While Do Loop Is: " + count1);
            count1++;


            int count2 = 1; //Will Excute at least once. Run the do and if can run the while.
            do {
                System.out.println("Count In The Do While Lopp Is: " + count2);
                count2++;
            } while (count2 < 11);

            Map m1 = new HashMap();
            m1.put("Zara", "8");
            m1.put("Mahnaz", "31");
            m1.put("Ayan", "12");
            m1.put("Daisy", "14");

            System.out.println();
            System.out.println(" Map Elements");
            System.out.print("\t" + m1);
        }
    }
}