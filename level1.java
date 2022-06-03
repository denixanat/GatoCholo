import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends Level
{
    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {
        super.addObject( new Score(),550,30);
        addObject(scenario1, 110, 355);
        addObjScenario();
        addArrows();
    }
    
    public void act(){
        timer.updateTimer(getLevel());
    }
}
