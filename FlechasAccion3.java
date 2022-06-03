import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlechasAccion3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlechasAccion3 extends Actor
{
    /**
     * Act - do whatever the FlechasAccion3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   GifImage myGif = new GifImage("g3.gif");
   private SimpleTimer tincola = new SimpleTimer();
   private long temporizador;
   private long cronometro;
   private int i;
   private int randomcola;
   private int random;
   private int rotation;
    public void act()
    {
          setImage(myGif.getCurrentImage());
        if (System.currentTimeMillis() - temporizador >= 500) {
            rotation = Greenfoot.getRandomNumber(4) * 90;
            random= Greenfoot.getRandomNumber(60) ;
            randomcola=Greenfoot.getRandomNumber(4+1) ;
            if(randomcola != 4){
                getWorld().addObject(new Flechas(rotation), placeArrow(rotation), getWorld().getHeight()-1);
            }
            
           if(random<4 && rotation != random*90 && randomcola != 4)
            {
                getWorld().addObject(new Flechas(random*90), placeArrow(random*90), getWorld().getHeight()-1);
            }
           
            if(randomcola==4)
            { 
                i=0;
                tincola.mark();
                while(i < 5){
                   getWorld().addObject(new Flechas(rotation), placeArrow(rotation), getWorld().getHeight()-1-(15*i));
                   i++;
                }
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
