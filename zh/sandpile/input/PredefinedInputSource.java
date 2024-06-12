package sandpile.input;

import java.io.FileReader;
import sandpile.input.InteractiveInputSource;
import java.io.FileNotFoundException;

public class PredefinedInputSource extends InteractiveInputSource{
    public PredefinedInputSource(String fileName) throws FileNotFoundException{
        super(new FileReader(fileName) );

    }
}