package Java1_Final;
/**
 * SquareRoot.java
 * 
 * Uses the method sqrt of class Math to output the integers 1 - 25 and their square roots to 2 decimal points. 
 * Output is print to screen in 2 columns with headers. 
 *  
 * @version 1.0
 * @since 2023-12-06
 * @author melinda britton
 */

import java.lang.Math; // allows use of Math functions by importing the Math library

public class SquareRoot {
    public static void main(String[] args) {
    
    // formats & prints header
    System.out.println();
    System.out.println("The square roots of the first 25 postive integers: ");// prints title
    System.out.printf("%s\t %8s %n", "Number", "Square Root");   // prints header values
    System.out.printf("%s\t %8s %n", "======", "===========");   // prints underline beneath values

    // for loop to declare number, calculate its square root & print result in 2 columns
    for (int number = 1; number <= 25; number++ ) {  // declares & initializes number and the range as well as incrementing by 1 each loop
        double squareRoot = Math.sqrt(number); // declares & initializes squareRoot and calculates the square root  
        System.out.printf("%4d %10.2f %n", number, squareRoot);  // prints results to screen in two columns under headers
        } // end for loop
    } // end method main
} 
       
 /**
  * Psuedocode
  * 1. Import Math library for square root class
  * 2. Format header style
  * 3. Use for loop to 
  *               i) generate integer using number++ 
  *              ii) calculate the square root of interger
  *             iii) print integer and its square root
  *              iv) repeat for intergers 1 - 25
  * 4. End program
  */
        




