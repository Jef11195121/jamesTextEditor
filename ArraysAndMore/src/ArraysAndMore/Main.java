package ArraysAndMore;

import java.util.*;

public class Main {

    public static void main(String[] args) {
// write your code here

        // write your code here

        // write your code here
        //look at https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);


        //And again...

        double[] myList = new double[2];   // preferred way.
        //http://www.tutorialspoint.com/java/java_arrays.htm

        myList[0] = 2.45;
        myList[1] = 1.34;

        int i;
        double total = 0;
        for(i = 0; i < myList.length; i++){
            total = total + myList[i];
        }
        System.out.println(total);

        //use of while and scanner
        //https://www.tutorialspoint.com/java/util/scanner_nextint.htm
        String s = "Hello World! 3 + 3.0 = 6 true";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // find the next double token and print it
        // loop for the whole scanner
        while (scanner.hasNext()) {

            // if the next is a double, print found and the double
            if (scanner.hasNextDouble()) {
                System.out.println("Found :" + scanner.nextDouble());
            }

            // if a double is not found, print "Not Found" and the token
            System.out.println("Not Found :" + scanner.next());
        }

        // close the scanner
        scanner.close();

        double[] myRain = new double[7];
        double rainTotal = 0;

        Scanner scanner2 = new Scanner(System.in);

        for(i = 0; i < myRain.length; i++){
            System.out.println("Enter rainfall for a day as decimal please ");

            //double thing =  scanner2.nextDouble();
            //System.out.println (thing);
            //rainTotal = rainTotal + myRain[i];

            myRain[i] = scanner2.nextDouble();
            rainTotal = rainTotal + myRain[i];
            //System.out.println(rainTotal);
        }
        System.out.println("The Total Rain Fall = " + rainTotal);

    double average = rainTotal / myRain.length; //Creates a double veribale. rainTotal divided by myRain
        System.out.println("The Average = " + average); //Prints out ("")

        //Finds the Largest Number
        double largest = 0.0; //Defines the veribale
        for(i=0; i < myRain.length; i++){ //Adds them together
            if(myRain[i] > largest){ //Checks if myRain for the largest number
                largest = myRain[i]; //Largest = myRain then the largest number
                System.out.println("Largest Number = " + largest); //Prints out the ("")
            }
        }
        System.out.println("The Current Largest Value = " + largest);
//Also see http://stackoverflow.com/questions/26210697/possible-to-loop-through-scanner-input

    }
}
