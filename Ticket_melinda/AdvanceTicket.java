/* 
 * An extention of the Ticket class that inherits its methods and
 * provides its own implementation for the ticket price based on the
 * number of days before the event the purchase is made through an
 * Override method.
 *   
 * @version 1.0
 * @since 2023-12-19
 * @author melinda britton
 */ 

public class AdvanceTicket extends Ticket {
    private int daysInAdvance;

    // Constructor that determines the number of days in advance a ticket is purchased, and calls the constructor from the Ticket superclass for the ticket number
    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        this.daysInAdvance = daysInAdvance;
    }

    // Implementation of the abstract method to get the price of an AdvanceTicket
    @Override
    public double getPrice() {
        if (daysInAdvance >= 10) {
            return 30.00; // Advance ticket purchased 10 or more days before the event
        } else {
            return 40.00; // Advance ticket purchased fewer than 10 days before the event
        }
    }
}
