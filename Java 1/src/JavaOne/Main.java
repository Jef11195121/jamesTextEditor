import java.util.Scanner;

public class introcode {

    public static void main (String [] args){
        System.out.println("Hello you peoples!!");
        System.out.println ( "Enter your age: " );

        Scanner sc = new Scanner (System.in);

        Integer age = sc.nextInt();

        System.out.println ( "Age is: " + age );

        System.out.printf("Enter k Value:  ");
        int k = sc.nextInt();
        System.out.printf("Enter j Value:  ");
        int j = sc.nextInt();
        if(k > j)
            System.out.println(k+" is greater than "+j);
        else if (j > k)
            System.out.println(j+" is greater than "+k);
        else if (k == j)
            System.out.println(j+" is equal to "+k);
        sc.close();

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;

        }

        int newcount = 1;
        do {
            System.out.println("Count is: " + newcount);
            newcount++;
        } while (newcount < 11);

        int i;
        double total = 0.0;
        double rainfallTsomething [] = new double [6];
        rainfallTsomething [0] = 1.1;
        rainfallTsomething [1] = 1.9;
        for (i = 0; i < rainfallTsomething.length; i++){
            total = total + rainfallTsomething [i];
            System.out.printLn("The total is  "+ total);
        }
    }

}
