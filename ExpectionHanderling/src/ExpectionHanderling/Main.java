package ExpectionHanderling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //get something from user and check it is as required!


        int count1 = 1;
        while (count1 < 11) {
            System.out.println("Count is: " + count1);
            count1++;
        }

        Scanner scanner2 = new Scanner(System.in);

        String thing =  scanner2.next();
        System.out.println (thing);


        Scanner scanner3 = new Scanner(System.in);

        int newThing =  scanner3.nextInt();
        System.out.println (newThing);

//http://beginnersbook.com/2013/04/try-catch-in-java/
        int num1, num2;
        try {
            // Try block to handle code that may cause exception
            num1 = 0;
            num2 = 62 / num1;
            System.out.println("Try block message");
        } catch (ArithmeticException e) {
            // This block is to catch divide-by-zero error
            System.out.println("Error: Don't divide a number by zero");
        }
        System.out.println("I'm out of try-catch block in Java.");

    }

}