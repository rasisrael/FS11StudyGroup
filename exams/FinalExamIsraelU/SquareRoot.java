package FinalExamIsraelU;
/**
Purpose: Write a program that uses the method sqrt of the class Math and outputs the square roots of the first 25 positive integers. 
(Your program must output each number and its square root.)

Save the file as SquareRoot.java

Sample Run:
The square roots of the first 25 positive integers:

@author Israel Uzcategui

*/

// start main method
public class SquareRoot {
    public static void main(String[] args) {
        
        // initialize
        int [] numbers = new int[25];
        double sqrt = 0;

        // print top 
            System.out.println("Number  Sqrt(Number)");
            System.out.println("======   ===========");

        // for loop
        for (int counter = 1; counter < numbers.length +1; counter++) {

            // calculate sqrt with math method
            sqrt = Math.sqrt(counter);

            // print numbers and its square root
            System.out.printf("%d \t %.2f %n", counter, sqrt );
        } // end for loop


    } // end main method
} // end SquareRoot.java
