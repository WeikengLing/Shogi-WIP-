import java.awt.*;

/**
 * Write a description of class BoardSpace here.
 * 
 * @author Melissa Chen 
 * @version 1.0 5/8/2018
 */
public class BoardSpace
{
    private int xpos;
    private int ypos;
    
    /**
     * 
     */
    public BoardSpace(int x, int y)
    {
        this.xpos = x;
        this.ypos = y;
    }
    
    /**
     * 
     */
    public void draw(Graphics g)
    {
        //sets the value of a new color "building gray" to a dark/concrete color 
        Color boardcolor = new Color(238, 191, 129);
        Color bordercolor = new Color(0,0,0);
        g.setColor(boardcolor);
        
        //draws and fills a rectangle at the inputted location using the inputted height and width
        g.fillRect(xpos,ypos,width,height);
        
        
    }
}
