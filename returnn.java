import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class returnn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class returnn extends Actor
{
    /**
     * Act - do whatever the returnn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new Manu());
        }
        
    }    
    public returnn(){
        GreenfootImage image = getImage();
        image.scale(15, 15);
        setImage(image);
    }
}
