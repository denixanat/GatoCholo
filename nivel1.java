import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel1 extends World
{
    public static int level=1;
    /**
     * Constructor for objects of class nivel1.
     * 
     */
    public nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new Score(),550,30);
        addObject(new FlechasAccion(),480,250);
        addObject(new temporizador(),70,30);
        addObject(new gato(),200,257);
        addArrows();
    }
    public void addArrows() {
        
        super.addObject(new N1(),110,355); 
        
        super.addObject(new flechasFijas(270), 200, 50); //left
        
          super.addObject(new flechasFijas(0), 275, 50); //up
        
          super.addObject(new flechasFijas(180), 350, 50); //down
        
        super.addObject(new flechasFijas(90), 425, 50); // right
        
        
        
       
    
        
   
    }
    
    
    public void stopped() {
    
    }
    
    public void started() {
     
    } 
    
   
    
}
