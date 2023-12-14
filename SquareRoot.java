/*Question 1
-----------
Purpose: Write a program that uses the method sqrt of the class Math and outputs the square roots of the first 25 positive integers. 
(Your program must output each number and its square root.)

Save the file as SquareRoot.java

Sample Run:
The square roots of the first 25 positive integers:
Number Sqrt(Number)
------ ------------
1 	1
2 	1.41
3 	1.73
4 	2
5 	2.24
6 	2.45
... 	...
*/


/** 
 * purpose : uses the method sqrt of the class Math and outputs the square roots of the first 25 positive integers.
 *@version 2.0
 *@since 2023-12-14
 *@author Yingying Wei
*/

public class SquareRoot {

    public static void main(String[] args) {
        //create an array of 25 integers
        int[] integers = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};

        // declear the variables
        double sqrtRoot = 0;

        // print out the header
        System.out.printf("%s %8s %n", "Numbers", "Square Root");
        System.out.printf("%3s %8s %n", "=======", "===========");

        // use the for loop to print out the 25 integers and their square roots
        for (int i = 0;i < integers.length;i++ ){

            System.out.printf("%5d %10.2f %n" ,integers[i], Math.sqrt(i));

        } //end for loop
    } // end main method
 
} // end SquareRoot class


