package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {  //this is a class

    public static void main(String[] args){
        //1.- Get the number of hours worked
            int hours = 0;
            System.out.println("How many hours did you work?"); //It's a way to prompt the user for input, making the program interactive

        Scanner scanner = new Scanner(System.in); //creates a Scanner object that reads input from the keyboard
        hours = scanner.nextInt(); // waits for the user to type an integer number and then stores that number in the variable

//This allows your program to get data from the user instead of using fixed values, making it interactive and flexible.



        //2.- Get the hourly pay rate
            double payRate = 0;
            System.out.println("What is your pay rate?");
            payRate = scanner.nextDouble(); //his allows your program to get the pay rate dynamically instead of using a fixed value, making it interactive and adaptable to different inputs.

            scanner.close(); //is used to close the Scanner object once you're done reading input.

        //3.- Multimply hours and pay Rate
            double grossPay = hours * payRate;

        //4.- Display Result
            System.out.println("Gross Pay: " + grossPay);
    }
}



