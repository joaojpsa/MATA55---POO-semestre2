import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedestre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedestre extends Actor
{
    /**
     * Act - do whatever the Pedestre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() -1);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() +1);
        }
        
        isAtropelado();
    }
    
    public void isAtropelado(){
        if(isTouching(Carro.class)){
            ((Rua) getWorld()).fimDeJogo();
            
        }
    }
}
