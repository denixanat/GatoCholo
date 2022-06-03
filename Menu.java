import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public static int level=0;
    Flecha flecha = new Flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        set();
    }
    
    private void set(){
        super.addObject( new Jugar(),300,230);
        super.addObject( new Instruccion(),300,330);
        super.addObject(flecha,300,255);  
        super.addObject(new titulo(),300,100);  
  
            }
    
    public void act(){
     if(Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}    
     if(Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;} 
     
     if(opcion>=2) opcion=0;
     if(opcion<0) opcion=1;
     flecha.setLocation(300,255 +(opcion*100));
     
         if(Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                Greenfoot.setWorld(new p3());
                break;
                case 1:
                Greenfoot.setWorld(new Instrucciones());
                break;
            }
        }
        
    }
}