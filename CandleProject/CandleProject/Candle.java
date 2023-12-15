package CandleProject;

/** Creates the Candle (parent) class. Uses get methods to obtain color & height. Generates price based on height = $2/inch
 *  @version 1.0
 *  @since 2023-12-13
 *  @author melinda britton
 */
public class Candle {
    // Data fields
    private String color;
    private int height; // in inches
    private double price; // in dollars

    // Constructor
    public Candle(String color, int height) {
        this.color = color;
        setHeight(height);
    }

    // Get methods
    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    // Set method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Set method for height
    public void setHeight(int height) {
        this.height = height;
        // Calculates price as $2 per inch
        this.price = height * 2.0;
    }
    // Set method for price
    protected void setPrice(double price) {
        this.price = price;
    }
}


