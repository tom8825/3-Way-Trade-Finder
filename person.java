
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    // Need better descriptors, what is a have, what is a need ? 
    // could we come up with a better name, if you read this 5 years from now, you may forget what trade they have
    // names like currentTrade or tradeNeeded|| just a random names off the top of my head, think of better ones
    int have;
    int need;
    String name;

    /**
     * Constructor for objects of class person
     */
    public person(String personName, int a, int b)
    {
        // initialise instance variables
        this.name = personName;
        this.have = a;
        this.need = b;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * 
     */
    public void setName(String n)
    {
        this.name = n;
    }

    /**
     * 
     */
    public int getHave()
    {
        return this.have;
    }
    
    /**
     * 
     */
    public int getNeed()
    {
        return this.need;
    }
    
    /**
     * 
     */
    public void setHave(int h)
    {
        this.have = h;
    }
    
    /**
     * 
     */
    public void setNeed(int n)
    {
        this.need = n;
    }
    
    public String toString() {
        return "Name: " + this.name + " Have: " + this.have + " Need: " + this.need;
    }
}
