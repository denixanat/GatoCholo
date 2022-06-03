import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gato extends Actor
{
    GifImage myGif = new GifImage("gato.gif");
    /**
     * Act - do whatever the gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        // Add your action code here.
    }
}
