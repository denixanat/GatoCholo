import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class go321 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class go321 extends Actor
{
    GifImage myGif = new GifImage("321.gif");
    /**
     * Act - do whatever the go321 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setImage(myGif.getCurrentImage());
         
     }
    }
