
/**
 * Abstract class Monster - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Monster
{
    // instance variables - replace the example below with your own
    private int health;
    private int speed; //I think speed should be a stat for how much pixels it moves per second so the larger numbers will represent more speed

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int getHealth()
    {
        return health;
        

    
    }
    
    public void setHealth(int inputhealth)
    {
        health = inputhealth;
        
    }
    
    public int getSpeed(){
        return speed;
        
    }
    
    public void setSpeed(int inputspeed)
    {
        
        speed = inputspeed;
        
    }
    
    
}
