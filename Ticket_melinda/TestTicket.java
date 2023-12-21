/** test application for ticket classes
 *  @version 1.0
 *  @since 2023-12-18
 *  @author melinda britton
 */

public class TestTicket {
    public static void main(String[] args) {
        // Create a WalkupTicket 
        WalkupTicket walkupTicket = new WalkupTicket(123);

        // Create an AdvanceTicket 
        AdvanceTicket advanceTicket = new AdvanceTicket(456, 15);

        // Create a StudentAdvanceTicket 
        StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(789, 8);

         // Display ticket information 
         System.out.println("Your ticket details: ");
         System.out.println("Walkup Ticket " + walkupTicket);
         System.out.println("Advance Ticket " + advanceTicket);
         System.out.println("Student Advance Ticket " + studentAdvanceTicket);

    
    }
}

