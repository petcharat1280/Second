import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Manu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manu extends World
{

    /**
     * Constructor for objects of class Manu.
     * 
     */
    public Manu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(41, 41, 15); 
        addObject(new easy1(), getWidth()/2, 10);
        addObject(new medium(), getWidth()/2, 20);
        addObject(new hard1(), getWidth()/2, 30);
    }
}
