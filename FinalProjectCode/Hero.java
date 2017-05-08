
public interface Hero
{
    
    
    public void setHealth(int health);
    
    public void showHealthBar();
    
    public void move();
    
    public int getHealth();
    
    public int getDamage();
    
    public void setDamage(int damage); // just in case we make some enemies that can change damage or abilities that boost attack
    
    
    public int getX();
    
    public int getY();
    
}
