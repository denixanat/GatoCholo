import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends Level
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {
        super.addObject( new Score(),550,30);
        setLevel(2);
        addObject(scenario2, 110, 355);
        addObjScenario();
        addArrows();
    }
    public void act(){
        timer.updateTimer(getLevel());
    }
}
