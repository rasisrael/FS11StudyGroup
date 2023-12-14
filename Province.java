
/*
* Question 5 (10 points)
======================
Purpose: to create a java class and test it.

create a class and named it Province. 
The Province class has a name, population, capital, and area. 

Create methods to manipulate the Province class. 
Create a tester class to test the class Province 

Save files as Province.java and ProvinceTester.java
*/

/** 
 * purpose : to create a java class and test it.
 *@version 2.0
 *@since 2023-12-14
 *@author Yingying Wei
*/

public class Province {
   
    //data member (attributes|field)
    private String name;
    private String population;
    private String capital;
    private String area;

    // declare the setter (mutator) methods
    public void setName(String newName){
        this.name = newName;
    } // end method setName

    public void setPopulation(String newPopulation){
        this.population = newPopulation;
    } // end method setPopulation

    public void setCapital(String newCapital){
        this.capital = newCapital;
    } // end method set Capital

    public void setArea(String newArea){
        this.area = newArea;
    } // end method setArea

    
    //declare the getter(accessor) method
    public String getName(){
        return this.name;
    } // end method getName

     public String getPopulation(){
        return this.population;
    } // end method getPopulation

     public String getCapital(){
        return this.capital;
    } // end method getCapital

     public String getArea(){
        return this.area;
    }// end method getArea

} // end class Province
