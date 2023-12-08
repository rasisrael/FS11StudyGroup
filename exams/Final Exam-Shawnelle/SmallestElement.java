
/**
 * Question 3
----------
Purpose:
Find smallest element in an array

Example:
Input:
Enter number of elements: 4
Input elements: 45, 25, 69, 40
Output:
Smallest element is: 25

Save the file as SmallestElement.java
 */
/**
 * @version 1.0
 * @since 06/12/23
 * @author Shawnelle McNichols
 */
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Input_______________________");
        System.out.print("Enter the number of elements: ");
        num = in.nextInt();
        int[] array = new int[num];

        System.out.print("Input elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        } // end for loop

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        } // end min for loop
        System.out.println("Output_______________________");
        System.out.println("Smallest element is: " + min);
        in.close();
    }// end method main
}// END
