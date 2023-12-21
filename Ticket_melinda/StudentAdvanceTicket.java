public class StudentAdvanceTicket extends AdvanceTicket {

    // Constructor for StudentAdvanceTicket
    public StudentAdvanceTicket(int number, int daysInAdvance) {
        // Call the constructor of the superclass (AdvanceTicket) with the given number and daysInAdvance
        super(number, daysInAdvance);
    }

    // Override the getPrice method from Ticket superclass to provide the pricing details for student advance tickets
    @Override
    public double getPrice() {
        if (getDaysInAdvance() >= 10) {
            return 15.0; // Student advance ticket purchased 10 or more days before the event
        } else {
            return 20.0; // Student advance ticket purchased fewer than 10 days before the event
        }
    }

    private int getDaysInAdvance() {
        return 0;
    }

    // Override the toString method from Ticket superclass to include information about the student ID requirement
    @Override
    public String toString() {
        return super.toString() + " (ID required)";
    }
}

