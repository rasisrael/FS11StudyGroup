


/** 
 * purpose : Find smallest element in an array
 *@version 2.0
 *@since 2023-12-06
 *@author Yingying Wei
*/

public class SmallestElement_v2 {
        public static void main(String[] args) {
                
                // Declare an array 
                int[] item = {45, 25, 69, 40};
        
                // declare and initialize the variable
                int min = item[0] ;  

                //create for loop to traverse the elements
                for (int i = 0; i < item.length; i++) {

                        // create if condition to select the smallest element
                        if ( item[i]< min ) {
                           min = item [i];
                  
                        } // end if condition
                }  // end for loop

                // display the result (termination) 
             System.out.println(); 
             System.out.println("The smallest element is : " + min);
             System.out.println();
        } //end main method
      
 } // end class SmallestElement_v2
        







/*Question 3
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