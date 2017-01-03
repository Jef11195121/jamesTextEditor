package Week4; //Pagename

import java.util.*; //Pulls in all the utilities to allow stuff to work like scanner.

public class Main { //Main class

    public static void main(String[] args) { //Only one (static), and does not pass anything back (void).
        int gotAge = getAge(); //Creates new variable.
        //System.out.println("Inside the main method you are " + gotAge + " Years old."); //Prints out this.

        boolean result = processAge(gotAge); //Creates Result
        System.out.println("Are you 50 or older: " + result); //Prints this out

        boolean driveResult = drivingAge(gotAge);
        System.out.println("Are you able to drive: " + driveResult);
    }

    public static int getAge(){ //Method
        System.out.println("Please Enter Your Age");
        Scanner scanner2 = new Scanner(System.in);
        int userAge = scanner2.nextInt();
        //System.out.println("Inside the getAge you are " + userAge + " Years old");
        scanner2.close();
        return userAge;
    }

    public static boolean processAge(int ageToProcess){ //Calculates if you are older then 50.
        boolean verdict = false;
        if(ageToProcess <= 50){
            verdict = false;
        }
        if(ageToProcess >= 51){
            verdict = true;
        }
        return verdict;
    }

    public static boolean drivingAge (int ageToDrive){ //Calculates if you can drive.
        boolean verdict = false;
        if(ageToDrive <= 15){
            verdict = false;
        }
        if(ageToDrive >= 16){
            verdict = true;
        }
        return verdict;
    }
}