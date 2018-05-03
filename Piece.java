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
    private int controller;
    

    /**
     * Move
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public void move()
    {
        // put your code here
        return x + y;
    }
}
