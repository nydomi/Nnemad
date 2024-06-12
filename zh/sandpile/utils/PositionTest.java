package sandpile.utils;
import sandpile.utils.Position;
import sandpile.utils.Direction;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;


public class PositionTest{
    @ParameterizedTest
    @CsvSource({"1,1","2,3","3,3"})
    public void testConstructor(int x, int y){
        Position asd = new Position(x,y);
        assertEquals(x,asd.getX());
        assertEquals(y,asd.getY());
    }

    @Test
    public void testConstructorException(){

    }
    @Test
    public void testMove(){
        Position good = new Position(5,5);
        assertEquals(true,good.move(Direction.UP));
        assertEquals(true,good.move(Direction.DOWN));
        assertEquals(true,good.move(Direction.LEFT));
        assertEquals(true,good.move(Direction.RIGHT));

        Position bad = new Position(0,0);
        assertEquals(false,bad.move(Direction.UP));
        assertEquals(false,bad.move(Direction.LEFT));
        assertEquals(true,bad.move(Direction.DOWN));
        assertEquals(true,bad.move(Direction.RIGHT));
    }
    @Test
    public void testDistance(){

    }
}