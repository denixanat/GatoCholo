import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flechas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flechas extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    mal actor_mal = new mal();
    bien actor_bien = new bien();
    /**
     * Act - do whatever the Flechas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - 5);
        Score s = getWorld().getObjects(Score.class).get(0);
        int points = 0, con=0; 
        if (isAtEdge()) {
            points = -1;
            s.update(points);
            getWorld().addObject(actor_mal, 100, 130);
            getWorld().removeObjects(getWorld().getObjects(bien.class));
            getWorld().removeObject(this);
        }
   
        if (getWorld() == null) return;
        
        if (isTouching(flechasFijas.class)) {
            if (checkArrow()) {
                points = 1;
                s.update(points);
                getWorld().addObject(actor_bien, 100, 130);
                getWorld().removeObjects(getWorld().getObjects(mal.class));
                getWorld().removeObject(this);
            }
           
        }
       
    }
    public Flechas(int rotation) {
        setRotation(rotation);
    }

    public boolean checkArrow() {
        int r = this.getX();  
        if (r == 275 && Greenfoot.isKeyDown("up")){
            return true;
        } 
        
        if (r == 425 && Greenfoot.isKeyDown("right")) {
            return true;
        } 
        
        if (r == 350 && Greenfoot.isKeyDown("down")) {
            return true;
        }  
        
        if (r == 200 && Greenfoot.isKeyDown("left")) {
            return true;
        }
        
        return false;
    }
}