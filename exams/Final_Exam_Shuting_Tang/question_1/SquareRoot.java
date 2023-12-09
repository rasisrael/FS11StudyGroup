// SquareRoot.java
package question_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Purpose: Write a program that uses the method sqrt of the class Math and 
 * outputs the square roots of the first 25 positive integers. 
 * 
 * @version 1.00
 * @since 2023-12-08
 * @author Shuting Tang
 * 
 */

// class declaration
public class SquareRoot {
    // main method begins the execution of java app
    public static void main(String[] args) {
        // declaration and initialization
        int number;
        double squareNum;
        int counter = 0;
        Scanner console = new  Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
    
        // show the heading
        System.out.println("Calculate the Square Root");
        System.out.println("=========================");

        try{
            // prompt user to type the number
            System.out.println("Enter the numbers separate by space: ");
            // read and store the positive number typed in
            while(counter < 25){
                number = console.nextInt();
                if(number > 0){
                    numList.add(number);
                    counter++;
                } // end if block
            } // end while loop
            console.nextLine();

        }catch(InputMismatchException ex){
            System.out.println(ex);
        }finally{
            // display the result
            System.out.printf("Number Sqrt(Number)%n");
            System.out.printf("------ ------------%n");
            for(int num = 0; num < numList.size(); num++){
                squareNum = Math.sqrt((double)numList.get(num));
                System.out.printf("%d \t %.2f%n",numList.get(num),squareNum);
            } // end for loop
        }// end try-catch block

        // close scanner object
        console.close();
    } // end method main
} // end class SquareRoot
