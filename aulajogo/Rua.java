import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rua extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Rua()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(JanelaFinal.class, Carro.class, Pedestre.class);
        
        criarComponentes();
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<2){
            addObject(new Carro(), 0, Greenfoot.getRandomNumber(400));
        }
    }
    
    public void criarComponentes()
    {
        addObject(new Pedestre(), 300, 10);
    }
    
    public void fimDeJogo(){
        addObject(new JanelaFinal("FIM DE JOGO!!!"), getWidth()/2, getHeight()/2);
        Greenfoot.playSound("buzu.mp3");
        Greenfoot.stop();
    }
}
