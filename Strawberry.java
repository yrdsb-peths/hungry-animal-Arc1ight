import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for Bee.
 * 
 * @author Marco 
 * @version May 2022
 */
public class Strawberry extends Actor
{
    /**
     * Act - do whatever the Stawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+1);
    }
}
