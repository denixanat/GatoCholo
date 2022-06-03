import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int score;
    public void act() 
    {
        // nah
    }    
    
    public Score() {
        score = 0;
        setImage(new GreenfootImage("Score: " + score, 20, Color.BLACK, Color.WHITE));
    }
    
  
    
    public void update(int num) {
        score += num;
        setImage(new GreenfootImage("Score: " + score, 20, Color.BLACK, Color.WHITE));
       if (score <-3)
       {
         getWorld().addObject(new FindelJuego(false), 300, 200);
            Greenfoot.stop();   
       }
        }
    }

