import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class Stars.
     * 
     */
    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepareBee();
        Strawberry();
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50,50);
        
        
    }
    
    public void prepareBee(){
        Bee Buzz = new Bee();
        addObject(Buzz,300, 200);
    }
    
    public void Strawberry()
    {
        Strawberry strawberry = new Strawberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(strawberry, x, y );
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
