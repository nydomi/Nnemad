package sandpile.input;

import sandpile.input.InputSource;
import java.io.BufferedReader;
import java.io.Reader;
import sandpile.utils.Direction;
import java.io.InputStreamReader;

public class InteractiveInputSource implements InputSource{
    private BufferedReader br;
    public Direction defaultDirection;
    public InteractiveInputSource(){
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }
    protected InteractiveInputSource(Reader source){
        
    }
    public Direction nextDirection(){

    }
}