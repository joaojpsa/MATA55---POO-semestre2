import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JanelaFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JanelaFinal extends Actor
{
    public static final float TAM_FONTE = 48.0f;
    public static final int LARGURA = 400;
    public static final int ALTURA = 300;
    
    public JanelaFinal(String mensagem){
        makeImage(mensagem);
    
    }
    
    public void makeImage(String mensagem){
        GreenfootImage image = new GreenfootImage(LARGURA, ALTURA);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, LARGURA, ALTURA);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, LARGURA -10, ALTURA -10);
        
        Font font = image.getFont();
        font = font.deriveFont(TAM_FONTE);
        
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(mensagem, 60, 100);
        setImage(image);
        
    }

}
