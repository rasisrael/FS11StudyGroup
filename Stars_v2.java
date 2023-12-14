


/** 
 * purpose : Using nested loop control structure to display a star pattern.
 *@version 2.0
 *@since 2023-12-06
 *@author Yingying Wei
*/



public class Stars_v2 {
    public static void main(String[] args) {

        // create an array star
        String[] star = new String[15] ;

        //  declare the variable
        String item = " * " ;

        // create for loop to print out the *
        for (int index = 0 ; index <= star.length; index++) {

           System.out.print(item );

           // create if condition to print out the * in new line
         if ( index == 0  | index == 2 | index == 5 | index == 9  ) {

            System.out.println();
                             
            } // end if condition

        } // end for loop
        
    } // end main method

} // end class Stars_v2








/*Question 4 (10 points)
======================
Purpose: Using nested loop control structure to display a star pattern.
Suppose you want to create the following pattern:

*
**
***
****
*****

Clearly, you want to print five lines of stars. In the first line you want to print one star, in the second line two stars, and so on.

Save the file as Stars.java


*   **   ***   ****   *****
0    2     5     9
*/





