import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Findeljuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindelJuego extends Actor
{
    
    reg actor_reg = new reg();
    /**
     * Act - do whatever the EndGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void win() {
        setImage(new GreenfootImage("win.png"));
        //getWorld().addObject(actor_reg, 300, 350);
    }
    
    public void lose() {
        setImage(new GreenfootImage("lose.png"));
    }
    
    public FindelJuego(boolean win) {
        if (win) {
            //getWorld().addObject(actor_reg, 300, 350);
            win();
        } else {
            lose();
        }
    }
}