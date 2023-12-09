// SmallestElement.java
package question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Purpose: Find smallest element in an array
 * 
 * Example:
 * Input:
 *      Enter number of elements: 4
 *      Input elements: 45, 25, 69, 40
 * Output:
 *      Smallest element is: 25
 * 
 * @version 1.00
 * @since 2023-12-06
 * @author Shuting Tang
 * 
 */

// class declaration
public class SmallestElement{
    // delcare the input variable
    static Scanner console = new Scanner(System.in);
    // main method begins the execution of java app
    public static void main(String[] args) {
        // declaration variables
        int quantOfNum,number,minNum,counter;
        String exit,numbers;
        String[] stringList;
   
        //initialize variables
        minNum = Integer.MAX_VALUE; // set minNum as the maximum value of Integer
        counter = 0;

        while (counter != -1) {
            // show the heading of this program
            System.out.println("Welcome to Smallest Element!");
            System.out.println("============================");

            // use try-catch to solve the exceptions
            try{
                // prompt user to enter the number of elements
                System.out.print("Enter number of elements: ");
                quantOfNum = console.nextInt();
                quantOfNum = intValidation(quantOfNum);
                console.nextLine();

                // prompt user to input elements
                System.out.print("Input elements: ");
                numbers = console.nextLine();
                stringList = numbers.split(", ");

                // read the input elements and find out the minimum element
                for(int num = 0; num < stringList.length; num++){
                    number = Integer.parseInt(stringList[num]);
                    if(number < minNum){
                        minNum = number; 
                    } // end if block
                } // end for loop

                
                System.out.printf("Smallest element of the first %d numbers is: %d%n",quantOfNum,minNum);

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
            } // end try-catch block
            System.out.println();

        } // end while loop
        //close scanner object
        console.close();
    }// end method main

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
} //  end class SmallestElement