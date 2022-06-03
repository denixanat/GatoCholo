import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlechasAccion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlechasAccion2 extends Actor
{
     GifImage myGif = new GifImage("g2.gif");
    long temporizador;
    int rotation;
    int random;
    public void act()
    {
        setImage(myGif.getCurrentImage());
        if (System.currentTimeMillis() - temporizador >= 500) {
            rotation = Greenfoot.getRandomNumber(4) * 90;
            random= Greenfoot.getRandomNumber(60+1);
            getWorld().addObject(new Flechas(rotation), placeArrow(rotation), getWorld().getHeight()-1);
            if(random<4 && rotation != random*90)
            {
                getWorld().addObject(new Flechas(random*90), placeArrow(random*90), getWorld().getHeight()-1);
            }
            temporizador = System.currentTimeMillis();
        } 
    } 
    
    public int placeArrow(int rotation) {
        int x = 0;
        
        if (rotation == 0) {
            x = 275;
        } else if (rotation == 90) {
            x = 425;
        } else if (rotation == 180) {
            x = 350;
        } else if (rotation == 270) { // rotation == 270
            x = 200;
        }
        
        return x;
    }
}
