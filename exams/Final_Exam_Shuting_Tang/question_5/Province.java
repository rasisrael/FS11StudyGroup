// Province.java
package question_5;

/**
 * create a class and named it Province. 
 * The Province class has a name, population, capital, and area. 
 * 
 * @version 1.00
 * @since 2023-12-06
 * @author Shuting Tang
 * 
 */

 // class declaration
public class Province {
    // declare data members
    private String name;
    private long population;
    private String capital;
    private double area;

    // default constructor
    public Province(){
        this.name = null;
        this.population = 0;
        this.capital = null;
        this.area = 0;
    }

    // constructor with parameter
    public Province(String theName,long thePopulation,String theCapital,double theArea){
        setName(theName);
        setPopulation(thePopulation);
        setCapital(theCapital);
        setArea(theArea);
    }

    public void setName(String theName){
        this.name = theName;
    }

    public void setPopulation(long thePopulation){
        this.population = thePopulation;
    }

    public void setCapital(String theCapital){
        this.capital = theCapital;
    }

    public void setArea(double theArea){
        this.area = theArea;
    }


    public String getName(){
        return this.name;
    }

    public long getPopulation(){
        return this.population;
    }

    public String getCapital(){
        return this.capital;
    }

    public double getArea(){
        return this.area;
    }


} // end class Province
