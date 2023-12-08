/**
 * Question 2
----------
Purpose: Convert temperatures. Prompt the user to enter the temperature in Celsius or Fahrenheit.
 
Implement the following double methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;

Save the file as TemperatureConverter.java
 */
import java. util.Scanner;
public class TemperatureConverter1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp;
        char scale;
        
        System.out.println("Enter the temperature: ");
        temp = in.nextDouble();
        System.out.println("Enter C to convert to celsius or F to convert to Farenheit: ");
        scale = in.next().charAt(0);
        switch (scale){
            case 'C':
            System.out.printf(temp + " degrees Fahrenheit converted to degrees Celsius is "+ Celsius(temp)); 
            System.exit(0);
            break;
            case 'F':
            System.out.print(temp + " degrees Celsius converted to degrees Fahrenheit is " + Fahrenheit(temp));
            break;
            default:
            System.out.println("Input invalid");

            in.close();
        }

    }// end method main

    public static double Celsius(double temp){
        double convertedTemp;
        convertedTemp = (temp - 32) * 5.0/9.0;
        return convertedTemp;
    }// end method Celsius
      public static double Fahrenheit(double temp){
        double convertedTemp;
        convertedTemp = (9.0/5.0) *(temp + 32);
        return convertedTemp;
    }// end method Celsius

}
