
import java.util.Scanner;
/** 
 * purpose : Using nested loop control structure to display a star pattern.
 *@version 1.0
 *@since 2023-12-06
 *@author Yingying Wei
*/



public class Stars {
    public static void main(String[] args) {
        String[] star = new String[5] ;
        
        String item = " * " ;
        //int NoStar = 1;

        for (int index = 0 ; index <= star.length; index++) {

           if (index>=0 && index < star.length) {
               
                System.out.println(item);
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
               
            } 
          

            

        }
        
    }

    
}























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


* ** *** **** *****
*/





