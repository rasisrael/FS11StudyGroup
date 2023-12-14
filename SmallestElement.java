

import java.util.*; 

/** 
 * purpose : Find smallest element in an array
 *@version 1.0
 *@since 2023-12-06
 *@author Yingying Wei
*/

public class SmallestElement {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
 
        // Declare an array 
        int[] item = new int[3];
        int item0 , item1 , item2 , min;
            min= item[0] ;
        
           // System.out.printf("%5s %10s %n", "index" , "value");
           // System.out.printf("%5s  ","====\t======== ");

      

          // assign values to integer numbers (initialization)
            System.out.println("Enter 3 integer values seperated with spaces: ");
            item0 = console.nextInt();
            item1 = console.nextInt();
            item2 = console.nextInt();

            for (int index = 1; index < item.length-1; index++) {
               
                if ( item[index]< min ) {
                    min = item [index];
                   

                }
            }   
            System.out.println("The smallest element is : " + min);
    









        
    }

   


}







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