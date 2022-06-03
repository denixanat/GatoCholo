import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{
      Flecha flecha = new Flecha();
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        super.addObject( new Instruccion(),300,50);
        super.addObject( new ins(),300,200);
        super.addObject( new Jugar(),300,350);
        super.addObject(flecha,300,380); 
        
    }
    
    public void act()
    {
    if(Greenfoot.isKeyDown("ENTER"))
    {
    Greenfoot.setWorld(new p1());  
    }
    }
    }

