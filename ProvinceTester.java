
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



public class ProvinceTester {
    public static void main(String[] args) {
       // create an instance (object) of class customer
       // Class_name object_name = new Class_name
       
       Province province1 = new Province();

       // define the data member(attribute|field) to contain the values
       String provinceName, provincePolulation, provinceCapital, provinceArea;

       //invoke setter(mutator) method to populate (assign)
       province1.setName("Quebec");
       province1.setPopulation("90,000,000");
       province1.setCapital("Quebec City");
       province1.setArea("1,000,000 m^2 "); 

       // invoke getter(accessor)method to retrieve the values
       provinceName = province1.getName();
       provincePolulation = province1.getPopulation();
       provinceCapital = province1.getCapital();
       provinceArea = province1.getArea();

       // display the result of the first province
        System.out.println();
        System.out.println("The name of the first province is: " + provinceName);
        System.out.println();
        System.out.println("The population of the first province is: " +  provincePolulation);
        System.out.println();
        System.out.println("The capital of the first province is: " +  provinceCapital);
        System.out.println();
        System.out.println("The area of the first province is: " +  provinceArea);
        System.out.println( );
    } // end method main
    
} // end class ProvinceTester
