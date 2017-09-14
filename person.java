
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    // instance variables - replace the example below with your own
    int have;
    int need;
    String name;

    /**
     * Constructor for objects of class person
     */
    public person(String personName, int a, int b)
    {
        // initialise instance variables
        name = personName;
        have = a;
        need = b;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * 
     */
    public int getHave()
    {
        return have;
    }
    
    /**
     * 
     */
    public int getNeed()
    {
        return need;
    }
    
    /**
     * 
     */
    public void setHave(int i)
    {
        have = i;
    }
    
    /**
     * 
     */
    public void setNeed(int i)
    {
        need = i;
    }
    
    public String toString() {
        return "Name: " + name + " Have: " + have + " Need: " + need;
    }
}
