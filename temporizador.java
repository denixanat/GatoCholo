import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class temporizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class temporizador extends Actor
{
    /**
     * Act - do whatever the temporizador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long timer;
    int runTime;
    int remaining;

    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //updateTimer();

     
    }   

    public temporizador() {
        runTime = 60;
        setImage(new GreenfootImage("Time Left: " + displayTime(runTime), 20, Color.BLACK, Color.WHITE));
        timer = System.currentTimeMillis();
    }

    public void updateTimer(int level) {
        int time = (int) ((System.currentTimeMillis() - timer) / 1000);
        remaining = runTime - time;
        //GreenfootSound sound = new GreenfootSound("nivel1.mp3");
        setImage(new GreenfootImage("Tiempo: " + displayTime(remaining), 20, Color.BLACK, Color.WHITE));
        if (remaining==0){
            if(/*nivel1.level==1*/level==1)
            {
                //nivel1.level=2;
                Greenfoot.setWorld(new p2());
            }else if(/*nivel2.level==*/level==2)
            {
           // sound.play();
                //nivel2.level=3;
                Greenfoot.setWorld(new p3());
            }else if(/*nivel3.level==*/level==3)
            {
               //sound.stop();
                getWorld().addObject(new FindelJuego(true), 300, 200);
                Greenfoot.stop();
            }
        }
    }
    

    public String displayTime(int runTime) {
        int min = runTime / 60;
        int sec = runTime % 60;

        String display = min + ":" + sec;

        return display;
    }
}