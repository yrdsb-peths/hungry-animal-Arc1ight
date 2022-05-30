import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mover();
        
        
    
    } 
    
    public void mover() 
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10);
            move(30);
        }
        if (Greenfoot.isKeyDown("Down")){
            setLocation(getX(),getY()+10);
            move(30);
        }
        if(getX() <= 1 || getY() >= getWorld().getWidth() -1)
       {
           move(0);
       }
       if(getY() <= 1 || getY() >= getWorld().getHeight()-1)
       {
           move(-0);
        }
       setLocation(getX()-10, getY());
       eat();
       
    }
    public void eat()
    {
        if(isTouching(Strawberry.class))
        {
            removeTouching(Strawberry.class);
            MyWorld world =(MyWorld) getWorld();
            world.Strawberry();
        }
    }
    
    
    
}
