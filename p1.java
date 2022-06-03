import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p1 extends World
{
    private int timer = 130;
    /**
     * Constructor for objects of class p1.
     * 
     */
    public p1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        Greenfoot.playSound("321go.mp3");
        super.addObject(new go321(),300,200);
        super.addObject(new g1(),550,300);
   
    }
    public void act()
    {
        if(timer>0)
        {
            timer--;
            if(timer == 0)
            { 
                Greenfoot.setWorld(new level1());
                Greenfoot.playSound("Calor.mp3");
            }
        }
     
    }
}
