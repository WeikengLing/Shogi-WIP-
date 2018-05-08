/**
 * This file represents a game piece in shogi. Each piece is able to move, move and capture, be captured, and be placed after getting captured
 * 
 * @author Willy Ling
 * @version 0.1 (04/28/2018)
 */
public abstract class Piece
{
    private String name;
    private String type;
    private int x;
    private int y;
    private int controller;
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getCoordinate()
    {
        return x + "-" + y + " --> " + x + "-"  + y;
    }
    
    public abstract void move();
    
    public abstract boolean canMove();
}
