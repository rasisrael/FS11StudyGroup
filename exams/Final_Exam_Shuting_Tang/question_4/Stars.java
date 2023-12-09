// Stars.java
package question_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Purpose: Using nested loop control structure to display a star pattern.
 * 
 * @version 1.00
 * @since 2023-12-06
 * @author Shuting Tang
 * 
 */

 // class declaration
public class Stars {
    // declare an global variable to input item
    static Scanner console = new Scanner(System.in);
    // main method begins the execution of java app
    public static void main(String[] args) {
        // declaration of variables
        int numOfStar,counter;
        String exit;

        //initialization
        counter=0;

        while(counter!=-1){
            // show the heading of this program
            System.out.println("Welcome to the Star Showcase!");
            System.out.println("=============================");

             // use try-catch to solve the exceptions
            try {
                // prompt user to enter the number of stars
                System.out.println("Enter the number of stars you want: ");
                numOfStar = console.nextInt();
                numOfStar = intValidation(numOfStar);
                System.out.println();
                
                // show the heading of result
                System.out.printf("Here is your stars: %n%n");
                // to display the stars in lines
                for(int line = 0; line < numOfStar; line++){
                    // display the stars in each line
                    for(int num = 0; num <= line; num++){
                        System.out.print("*");
                    } // end the for loop
                    System.out.println();
                }// end for loop
                System.out.println();

                // prompt user to choose continue or not
                System.out.println("Enter \'Y/y\' to continue or press any key to quit");
                exit = console.next();
                counter = continueOrNot(exit);

            } catch (InputMismatchException e) {
                // show the info if the input is not match the data type
                System.out.println( "This value is invalid.");
                console.nextLine(); // turn to next line
                System.out.println("Enter \'Y/y\' to restart or press any key to quit");
                exit = console.next();
                counter = continueOrNot(exit);
                continue;
            }// end try-catch block
        } //  end while loop
        
        // close scanner object
        console.close();
    } // end method main

    // to check if the number which data type is int, is greater than and equal to 0
    public static int intValidation(int num){
        int temp = num;
        while(temp < 0 ){
            System.out.println("Invalid value, please reset it (enter >= 0):");
            temp = console.nextInt();
        }
        return temp;
    }// end method intValidation

    // prompt user to decide continue or not
    public static int continueOrNot(String exit){
        int temp = 0;
        if(!exit.toUpperCase().equals("Y")){
            System.out.println("Thank you for using this App!");
            temp = -1;
        }
        console.nextLine();
        System.out.println();
        return temp;
    } // end method continueOrNot

} // end class Stars
