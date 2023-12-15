package CandleProject;

/* Application instantiates a Candle object & a ScentedCandle object based on user's input for color,
 * height and scent for scented candle. Displays details of each type of candle.
 * @version 1.0
 * @since 2023-12-13
 * @author melinda britton
 */

import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for unscented Candle details
        System.out.println("Enter details for the unscented Candle:");
        System.out.print("Color: ");
        String candleColor = scanner.nextLine();
        System.out.print("Height (in inches): ");
        int candleHeight = scanner.nextInt();

        // Instantiate (create) a Candle object
        Candle candle = new Candle(candleColor, candleHeight);

        // Clear the scanner buffer
        scanner.nextLine();

        // Prompt the user for ScentedCandle details
        System.out.println("\nEnter details for the ScentedCandle:");
        System.out.print("Color: ");
        String scentedCandleColor = scanner.nextLine();
        System.out.print("Height (in inches): ");
        int scentedCandleHeight = scanner.nextInt();

        // Clear the scanner buffer
        scanner.nextLine();

        // Displays and prompts scent options for user
        System.out.println("Choose a scent for the ScentedCandle:");
        System.out.println("1. Smoke");
        System.out.println("2. Tuberose");
        System.out.println("3. Bergamot");
        System.out.println("4. Cedar");

        int choice = scanner.nextInt();
        String scent;

        // Captures user's scent selection - uses fancy java 12 switch -> instead of break lines
        switch (choice) {
            case 1 -> scent = "Smoke";
            case 2 -> scent = "Tuberose";
            case 3 -> scent = "Bergamot";
            case 4 -> scent = "Cedar";
            default -> {
                System.out.println("Invalid choice. Defaulting to Smoke.");
                scent = "Smoke";
            }
        }

        // Instantiate (create) a ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle(scentedCandleColor, scentedCandleHeight, scent);

        // Display header for details for each Candle
        System.out.println("\nDetails for the unscented Candle:");
        displayCandleDetails(candle);

        System.out.println("\nDetails for the ScentedCandle:");
        displayCandleDetails(scentedCandle);
    }

    // Display details for each Candle - used for both types of candles
    private static void displayCandleDetails(Candle candle) {
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());
    }
}
