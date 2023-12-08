package FinalExamIsraelU;
/* Israel Uzcategui
 * Question 5
 * Province.java
 * Purpose: to create a java class and test it.

create a class and named it Province. 
The Province class has a name, population, capital, and area. 

Create methods to manipulate the Province class. 
Create a tester class to test the class Province 
 * 
 */




public class ProvinceTester {
// start main method
    public static void main(String[] args) {
        // create instance of class Province

        Province Quebec = new Province();

        // define attributes
        String name; int population; String capital; double area;

        // invoke setter
        Quebec.setName("Quebec");
        Quebec.setPopulation(8485000);
        Quebec.setCapital("Quebec City");
        Quebec.setArea(1668000000);

        // invoke getter
        name = Quebec.getName();
        population = Quebec.getPopulation();
        capital = Quebec.getCapital();
        area = Quebec.getArea();

        // display results

        System.out.println();
        System.out.println("The name of the province is: " + name);
        System.out.println();
        System.out.println("The population of " + name + " is " + population);
        System.out.println();
        System.out.println("The capital of " + name + " is " + capital);
        System.out.println();
        System.out.printf("%s %s %s %f %s", "The area of " , name , " is " , area ,"km2");
        System.out.println();

        
    }
    
}
