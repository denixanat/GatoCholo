import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reg extends Actor
{
    /**
     * Act - do whatever the reg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("ENTER"))
        {
             Greenfoot.setWorld(new Menu());
        }
    }
}
