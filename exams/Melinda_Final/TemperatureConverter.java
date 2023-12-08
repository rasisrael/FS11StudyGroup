package Java1_Final;

/**
 * TemperatureConverter.java
 * 
 * Prompts user to choose type of temperature conversion: Celsius to Fahrenheit or Fahrenheit to Celsius. Performs converstion calculation. Returns answer on screen.
 *  
 * @version 1.0
 * @since 2023-12-06
 * @author melinda britton
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print user prompts to screen
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");
        
        // collect user choice
        int choice = scanner.nextInt();

        // if else method to determine type of conversion required and prints results to screen
        // flags user error if user inputs anything beside "1" or "2"
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("Temperature in Fahrenheit: %.0f%n", + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("Temperature in Celsius: %.0f%n", + celsius);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        } // end if else method

        scanner.close();

    } // end method main

    // conversion method 1 (calculation for Celsius to Fahrenheit conversion) 
    private static double celsiusToFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    } // end conversion method 1

    // conversion method 2 (calculation for Fahrenheit to Celsius conversion) 
    private static double fahrenheitToCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    } // end conversion method 2
}

/**
 * Psuedocode
 * 1. Offers user with 2 options for temperature conversion: 
 *              1. Celsius to Fahrenheit, or 
 *              2. Fahrenheit to Celsius 
 * 2. If choice is 1
 *              user is prompted to enter temperature in Celsius, 
 *              temperature is converted to Fahrenheit, 
 *              result is printed to screen
 * 3. If choice is 2
 *              user is prompted to enter temperature in Fahrenheit, 
 *              temperature is converted to Celsius, 
 *              result is printed to screen
 * 4. If choice is neither of these error is reported and user is prompted to enter 1 or 2
 *      !! I couldn't figure out the while loop to bring user back to step 1
 *      !! I think a while loop would also make this possible:
 *      !! 5. Ask user if they have another temperature to convert, if yes return to step 1, else
 * 6. End program
 */