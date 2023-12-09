// TemperatureConverter.java
package question_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Purpose: Convert temperatures. Prompt the user to enter the temperature in Celsius or Fahrenheit.
 * 
 * @version 1.00
 * @since 2023-12-08
 * @author Shuting Tang
 * 
*/

// class declaration
public class TemperatureConverter {
    // main method begins the execution of java app
    public static void main(String[] args) {
        // declaration and initialization
        double temperature,newTemparature;
        int number = 0,counter = 0;
        Scanner console = new Scanner(System.in);
        
        while(counter != -1 ){
            try{
            // prompts the user to select the temperature conversion method
            System.out.println("Please chosse the temperature conversion method by number:");
            System.out.println("1. Enter 1 choose Fahrenheit to Celsius");
            System.out.println("2. Enter 2 choose Celsius to Fahrenheit");
            System.out.println("3. Enter -1 to quit");
            number = console.nextInt();
            console.nextLine();

                // processing and output the result
                if(number == 1){ 
                    // prompt the user to enter the temperature
                    System.out.println("Enter the number of degrees in Fahrenheit: ");
                    temperature = console.nextDouble();
                    console.nextLine();
                    newTemparature =  5.0 / 9.0 * (temperature - 32);
                    System.out.printf("%.2f degrees Fahrenheit is equivalent of %.2f degree Celsius %n",temperature,newTemparature);
                }else if(number == 2){
                    // prompt the user to enter the temperature
                    System.out.println("Enter the number of degrees in Celsius: ");
                    temperature = console.nextDouble();
                    console.nextLine();
                    newTemparature =  9.0 / 5.0 * temperature + 32;
                    System.out.printf("%.2f degrees Celsius is equivalent of %.2f degree Fahrenheit %n",temperature,newTemparature);
                }else if(number == -1) {
                    counter = -1;
                }// end if block
            }catch(InputMismatchException ex){
                System.out.println(ex);
                break;
            } //  end try-catch block
            System.out.println();
        } // end while loop

        // close scanner object
        console.close();
    } // end method main
} // end classTemperatureConverter
