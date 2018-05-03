import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

/**
 * Class shogi_game - write a description of the class here
 * 
 * @author Willy Ling 
 * @version 0.1b (04/28/2018)
 */
public class shogi_game extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;

    private final int APPLET_WIDTH = 1280;
    private final int APPLET_HEIGHT = 720;
    
    //create the board, two players
    k,
    private Board gameboard;
    private ;
    
    /**
     * Creates the initial environmet - buildings, sun, moon, ground, and applet size
     */
    public void init ()
    {
        //buildings 1, 2, and 3
        building1 = new Building (50, 400, 80, 118);
        building2 = new Building (175, 400, 122, 260);
        building3 = new Building (350, 400, 100, 202);
        building4 = new Building (500, 400, 80, 148);
        
        //initilzing each object that changes
        Thread b1 = new Thread(building1);
        b1.start();
        Thread b2 = new Thread(building2);
        b2.start();
        Thread b3 = new Thread(building3);
        b3.start();
        Thread b4 = new Thread(building4);
        b4.start();
        Thread sun = new Thread(s);
        sun.start();
        Thread moon = new Thread(m);
        moon.start();
        
        //initilize the background color to "midnight" - a self made color
        setBackground(midnight);
        
        //set the size of the applet to 1000, 500
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        // simple text displayed on applet
        g.setColor(Color.white);
        g.fillRect(0, 0, 200, 100);
        g.setColor(Color.black);
        g.drawString("Sample Applet", 20, 20);
        g.setColor(Color.blue);
        g.drawString("created by BlueJ", 20, 40);
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
