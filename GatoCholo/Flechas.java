import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flechas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flechas extends Actor
{
    /**
     * Act - do whatever the Flechas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - 5);

        Score s = getWorld().getObjects(Score.class).get(0);
        int points = 0; 

        if (isAtEdge()) {
            points = -1;
            s.update(points);
            getWorld().removeObject(this);
        }
        if (getWorld() == null) return;
        if (isTouching(flechasFijas.class)) {
            Actor a = getOneIntersectingObject(flechasFijas.class);
            if (checkArrow(a)==1) {
                points = 1;
                s.update(points);
                getWorld().removeObject(this);
            }
           else if (checkArrow(a)==2)
            {
                points = -1;
            s.update(points);
            
            }
        }
       
    }
    public Flechas(int rotation) {
        setRotation(rotation);
    }

    public int checkArrow(Actor a) {
        int r = getRotation();
        int ar = a.getRotation();
        if (r == 0 && ar == 0 && Greenfoot.isKeyDown("up")) {
            return 1;
        }  
        else if(r == 0 && ar == 0 && (Greenfoot.isKeyDown("right") ||Greenfoot.isKeyDown("down") ||Greenfoot.isKeyDown("left")))
        {
           return 2;
        }
        
        if (r == 90 && ar == 90 && Greenfoot.isKeyDown("right")) {
            return 1;
        } 
        else if(r == 0 && ar == 0 && (Greenfoot.isKeyDown("up") ||Greenfoot.isKeyDown("down") ||Greenfoot.isKeyDown("left")))
        {
           return 2;
        }
        
        if (r == 180 && ar == 180 && Greenfoot.isKeyDown("down")) {
            return 1;
        }  
        else if(r == 0 && ar == 0 && (Greenfoot.isKeyDown("up") ||Greenfoot.isKeyDown("right") ||Greenfoot.isKeyDown("left")))
        {
           return 2;
        }
        
        if (r == 270 && ar == 270 && Greenfoot.isKeyDown("left")) {
            return 1;
        }
        else if(r == 0 && ar == 0 && (Greenfoot.isKeyDown("up") ||Greenfoot.isKeyDown("right") ||Greenfoot.isKeyDown("down")))
        {
           return 2;
        }
        return 3;
    }
    

}
