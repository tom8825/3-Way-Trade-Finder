import java.util.*;
/**
 * Write a description of class trade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class trade
{
    // instance variables - replace the example below with your own
    ArrayList<person> people = new ArrayList<person>();

    /**
     * Constructor for objects of class trade
     */
    public trade()
    {
        // initialise instance variables
        
        
    }

    /**
     * 
     */
    public void findTrade(person a)
    {
        for (person b : people){
            if(!b.equals(a)){
                if(a.getHave() == b.getNeed()){
                    for (person c : people){
                        if(!c.equals(a) && !c.equals(b)){
                            if(b.getHave() == c.getNeed() && c.getHave() == a.getNeed()){
                                System.out.println("---A trade sequence has been found.---");
                                System.out.println("Person: "+ a.getName() + ": " + "Has: "+ a.getHave() +", Needs: " + a.getNeed());
                                System.out.println("Person: "+ b.getName() + ": " + "Has: "+ b.getHave() +", Needs: " + b.getNeed());
                                System.out.println("Person: "+ c.getName() + ": " + "Has: "+ c.getHave() +", Needs: " + c.getNeed());
                            }
                        }
                    }
                }
            }
        }
    }
    
    /**
     *
     */
    public void testMethod()
    {
        randomDataGen();
        
        for (person b : people){
            findTrade(b);
        }     
    }
    
    /**
     * 
     */
    public void randomDataGen()
    {
        for(int i=1; i<100; i++)
        {
            int randomHave = (int )(Math.random() * 50 + 1);
            int randomNeed = (int )(Math.random() * 50 + 1);
            person o = new person(Integer.toString(i),randomHave,randomNeed);
            people.add(o);
        }
    }
}
