package sandpile.entity;
import sandpile.utils.Position;
import sandpile.input.InputSource;

public class Entity{
    private Position position;
    public Position getPosition(){
        return position;
    }

    private InputSource inputSource;
    public Entity(int x, int y, InputSource inputSource){

    }
    public boolean move(){
        return true;
    }
}
