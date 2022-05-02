import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel2 extends World
{
 public static int level=2;
    /**
     * Constructor for objects of class nivel2.
     * 
     */
    public nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        super.addObject( new Score(),550,30);
        super.addObject(new FlechasAccion(),600,10);
        super.addObject(new temporizador(),50,30);
        addArrows();
    }
    public void addArrows() {
        getBackground().drawImage(new GreenfootImage("NIVEL 2", 64, null, null), 60, 100);
        super.addObject(new flechasFijas(0), 425, 50); // right
        super.addObject(new flechasFijas(90), 275, 50); //down
        
        super.addObject(new flechasFijas(270), 200, 50); //up
        super.addObject(new flechasFijas(180), 350, 50); //left
    }
    
    
    public void stopped() {
        
    }
    
    public void started() {
     
    } 
}
