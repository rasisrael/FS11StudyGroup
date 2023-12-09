// ProvinceTester.java
package question_5;

/**
 * using to test the class Province 
 * 
 * @version 1.00
 * @since 2023-12-06
 * @author Shuting Tang
 * 
 */

 // class declaration
public class ProvinceTester {
    // main method begins the execution of java app
    public static void main(String[] args) {
        // declare new instances
        Province firstProvince = new Province();
        Province secondProvince = new Province("Ontario",14223942,"Toronto",1076395);

        // test setter methods
        firstProvince.setName("Quebec");
        firstProvince.setPopulation(8501833);
        firstProvince.setCapital("Quebec City");
        firstProvince.setArea(1542056.14);

        // test getter methods
        System.out.printf("Province Details%n");
        System.out.printf("================%n");
        System.out.printf("%s \t\t%s \t\t%s \t\t%s%n","Name","Population","Capital","Area(km^2)");
        System.out.printf("%s \t\t%d \t\t%s \t\t%.2f%n",firstProvince.getName(),firstProvince.getPopulation(),firstProvince.getCapital(),firstProvince.getArea());
        System.out.printf("%s \t%d \t\t%s \t\t%.2f%n",secondProvince.getName(),secondProvince.getPopulation(),secondProvince.getCapital(),secondProvince.getArea());


    } // end method main
} // end class ProvinceTester
