package sandpile.input;
import sandpile.input.InputSource;
import sandpile.utils.Position;
import sandpile.utils.Direction;
import java.util.Random;

public class RandomInputSource implements InputSource{
    Random rand = new Random();
    static final Direction  [] allDir = Direction.values();
    public RandomInputSource(){
    } 
    public Direction nextDirection(){
        Direction dir = null;
        int i = rand.nextInt(4);
        if(i == 0) {
            dir =  Direction.UP;
        }
        else if(i == 1){
            dir =  Direction.RIGHT;
        }
        else if(i == 2){
            dir = Direction.DOWN;
        }
        else if(i == 3){
            dir =  Direction.LEFT;
        }
        return dir;
    }
}
