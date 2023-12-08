/**
 * Question 1
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
 * @version 1.0
 * @since 06/12/23
 * @author Shawnelle McNichols
 */

import java.lang.Math;

public class SquareRoot{
    public static void main(String[] args) {
        System.out.println("The square root of the first 25 positive integers:");
        System.out.println("Number  Sqrt(Number)");
        System.out.println("------  ------------");
        for (int i = 1; i <= 25; i++) {
            System.out.printf("%-8s" , i);
            System.out.printf("%.2f %n",Math.sqrt(i));
        }
    }
}