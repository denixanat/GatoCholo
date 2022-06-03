import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class p1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p3 extends World
{
    private int timer = 130;
    /**
     * Constructor for objects of class p1.
     * 
     */
    public p3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.playSound("321go.mp3");
        super.addObject(new go321(),300,200);
        super.addObject(new g3(),550,350);
    }
    public void act()
    {
    if (timer>0)
    {
        timer--;
        if(timer == 0)
        { Greenfoot.setWorld(new level3());
        Greenfoot.playSound("Exstasis.mp3");}
    }
     
    }
}

