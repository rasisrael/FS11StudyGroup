
/**
 * Abstract and superclass for the Campus Movie tickets. Defines the 
 * common structure for different types of tickets. Includes a constructor
 * to initialize the ticket number, an abstract method for subclasses
 * to get the ticket price, a getter method for subclasses to get the
 * ticket number, and a toString method to print out the information. 
 * Subclasses have their own implementation for getPrice method.
 * 
 * @version 1.0
 * @since 2023-12-19
 * @author melinda britton
 */


public abstract class Ticket {
    // data member
    private int number;
    
    // constructor for ticket number
    public Ticket(int number) {
        this.number = number;
    }

    // abstract method for subclasses to get price of ticket
    public abstract double getPrice();

    // getter method for subclass to get the ticket number
    public int getNumber() {
        return number;
    }

    // toString method to output ticket information
    @Override
    public String toString() {
        String formattedPrice = String.format("$%.2f", getPrice()); // formats how ticket price is displayed
        return "Number: " + number + ", Price: " + formattedPrice;
    }

}
