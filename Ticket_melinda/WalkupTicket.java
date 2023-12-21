/* 
 * An extention of the Ticket class that inherits its methods and
 * provides its own implementation for the ticket price through an
 * Override method.
 *   
 * @version 1.0
 * @since 2023-12-19
 * @author melinda britton
 */ 

public class WalkupTicket extends Ticket {
    // call the constructor from the superclass Ticket for the ticket number
    public WalkupTicket(int number) {
        super(number);
    }
    
   // override the abstract getPrice method from Ticket and return the fixed price of $50.00
    @Override
    public double getPrice() {
        return 50.00; 
    }
}
