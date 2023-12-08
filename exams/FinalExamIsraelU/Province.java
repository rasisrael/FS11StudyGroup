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


public class Province {
    // data members
    private String name;
    private int population;
    private String capital;
    private double area;
    
    // declare setter
    public void setName (String newName) {

            this.name = newName;
    } // end method setName

    public void setPopulation (int newPop) {

            this.population = newPop;
    } // end method setPopulation

    public void setCapital (String newCapital) {

            this.capital = newCapital;
    } // end method setCapital

    public void setArea (double newArea) {

            this.area = newArea;
    } // end method setPopulation

//============================================

        // declare getter
    public String getName () {
            return this.name;
    } // end method getName

    public int getPopulation () {
            return this.population;
    } // end method getPopulation

        public String getCapital () {
            return this.capital;
    } // end method getCapital

        public double getArea () {
            return this.area;
    } // end method getArea


} //end of province class