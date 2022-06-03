import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel3 extends World
{
 public static int level=3;
    /**
     * Constructor for objects of class nivel3.
     * 
     */
    public nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     super(600, 400, 1); 
        super.addObject( new Score(),550,30);
        super.addObject(new FlechasAccion3(),460,260);
        super.addObject(new temporizador(),70,30);
        super.addObject(new gato(),200,257);

        addArrows();
    }
    public void addArrows() {
        super.addObject(new N3(),110,355);  
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
