package CandleProject;
/** Creates the ScentedCandle (child) class. Uses get methods to obtain color & height from Candle (parent) class. Generates price based on height = $3/inch
 *  @version 1.0
 *  @since 2023-12-13
 *  @author melinda britton
 */
public class ScentedCandle extends Candle {
    // Additional data field
    private String scent;

    // Constructor
    public ScentedCandle(String color, int height, String scent) {
        super(color, height); // Call the constructor of the parent class (candle)
        this.scent = scent;
        setPrice(height * 3.0);
    }

    // Override the parent's setHeight method to set the price at $3 per inch
    @Override
    public void setHeight(int height) {
        super.setHeight(height); // Call the setHeight method of the parent class (Candle)
        setPrice(height * 3.0); // Override the price calculation in the parent class
    }

    // Get method for scent
    public String getScent() {
        return scent;
    }

    // Set method for scent
    public void setScent(String scent) {
        this.scent = scent;
    }


}

