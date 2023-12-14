/*Question 2
----------
Purpose: Convert temperatures. Prompt the user to enter the temperature in Celsius or Fahrenheit.
 
Implement the following double methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;

Save the file as TemperatureConverter.java
*/

import java.util.Scanner;

/** 
 * purpose : Convert temperatures.
 *@version 2.0
 *@since 2023-12-14
 *@author Yingying Wei
*/


public class TemperatureConverter {
    public static void main(String[] args) {
     double temC = 0;
     double temF = 0;  

     temF =9.0 / 5.0 + 32 ;
     temC = 5.0 / 9.0 - 32 ;

     Scanner input = new Scanner(System.in);

     System.out.println("Please enter the degree in Celsius : ");
     temC = input.nextDouble();
     
     System.out.println("The fahrenheit degree is : " + temF);

     System.out.println("Please enter the degree in Fahrenheit : " );
     temF = input.nextDouble();
        System.out.println("The celcius degree is: " + temC);
    }

  
}
