import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hard1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hard1 extends Actor
{
    /**
     * Act - do whatever the hard1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new Hard());
        }
    }    
}
