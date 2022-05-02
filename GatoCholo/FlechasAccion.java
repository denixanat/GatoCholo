import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlechasAccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlechasAccion extends Actor
{
    /**
     * Act - do whatever the FlechasAccion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long temporizador;
    public void act()
    {
        if (System.currentTimeMillis() - temporizador >= 500) {
            int rotation = Greenfoot.getRandomNumber(4) * 90;
            getWorld().addObject(new Flechas(rotation), placeArrow(rotation), getWorld().getHeight());
            temporizador = System.currentTimeMillis();
        } 
    }  
    
    public int placeArrow(int rotation) {
        int x = 0;
        
        if (rotation == 0) {
            x = 425;
        } else if (rotation == 90) {
            x = 275;
        } else if (rotation == 180) {
            x = 350;
        } else { // rotation == 270
            x = 200;
        }
        
        return x;
    }
}
    
