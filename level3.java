import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends Level
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {
        super.addObject( new Score(),550,30);
        setLevel(3);
        addObject(scenario3, 110, 355);
        addObjScenario();
        addArrows();
    }
    public void act(){
        timer.updateTimer(getLevel());
    }
}
