package sandpile.utils;
import sandpile.utils.Direction;
import java.lang.IllegalArgumentException;

public class Position{
    private int x;
    public int getX(){
        return x;
    }
    private int y;
    public int getY(){
        return y;
    }
    public static final int X_UPPER_BOUND = 20;
    public static final int X_LOWER_BOUND = 0;
    public static final int Y_UPPER_BOUND = 20;
    public static final int Y_LOWER_BOUND = 0;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override 
    public boolean equals(Object obj){

        if(obj instanceof Position){
            Position tmp = (Position)obj;
            return this.x == tmp.getX() && this.y == tmp.getY();
        }   
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    } 

    public static boolean isOutOfBound(int x, int y){
        if(x < 0 || 20 < x || 0 > y || 20< y){
            throw new IllegalArgumentException("Coordinates out of bounds!");
        }
        return true;
    }
    public boolean move(Direction dir){
        int tempDireX = x;
        int tempDireY = y;
        if(dir == Direction.UP){
            tempDireY--; 
        } 
        else if(dir == Direction.DOWN){
            tempDireY++;
        }
        else if(dir == Direction.LEFT){
            tempDireX--;
        }
        else if(dir == Direction.RIGHT){
            tempDireX++;
        }

        if(tempDireX > X_UPPER_BOUND || tempDireX < X_LOWER_BOUND){
            return false;
        }
        if(tempDireY > Y_UPPER_BOUND || tempDireY < Y_LOWER_BOUND){
            return false;
        }
        x = tempDireX;
        y = tempDireY;
        return  true;
    }
    public static int turnDistance(Position from, Position till){
        return (from.getX()-from.getX()) + (till.getY()-till.getY());
    }
    private static int getXOffset(Direction dir){
             return 0; // változott a strucktúrális teszt
    }
    private static int getYOffset(Direction dir){
        /*int tempDireX = x;
        if(dir == Direction.LEFT){
            tempDireX--;
        }
        else if(dir == Direction.RIGHT){
            tempDireX++;
        }
        x = tempDireX;*/
        return 0; // menet közben változott a stuki teszt!
    }

}