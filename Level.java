import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Level extends World
{
    protected int level=1;
    
    public temporizador timer = new temporizador();
    public static gato miau = new gato();
    protected FlechasAccion ArrowAct_type1 = new FlechasAccion();
    protected FlechasAccion2 ArrowAct_type2 = new FlechasAccion2();
    protected FlechasAccion3 ArrowAct_type3 = new FlechasAccion3();
    protected N1 scenario1 = new N1();
    protected N2 scenario2 = new N2();
    protected N3 scenario3 = new N3();
    /**
     * Constructor for objects of class Level.
     * 
     */
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public Actor Select_ArrowAct(int level_number){
        switch(level_number){
            case 1:
                return ArrowAct_type1;
            case 2:
                return ArrowAct_type2;
            case 3:
                return ArrowAct_type3;
        }
        return null;
    }
    public void addObjScenario(){
        addObject(Select_ArrowAct(getLevel()),480,250);
        addObject(timer,70,30);
        addObject(miau,200,257);
        addArrows();
    }
    public void addArrows() {
        //addObject(new N1(),110,355); 
        
        addObject(new flechasFijas(270), 200, 50); //left
        
        addObject(new flechasFijas(0), 275, 50); //up
        
        addObject(new flechasFijas(180), 350, 50); //down
        
        addObject(new flechasFijas(90), 425, 50); // right

    }
    
    public void setLevel(int level){
        this.level = level;
    }
    
    public int getLevel(){
        return level;
    }
    
}
