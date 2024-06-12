import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class InteractiveInputSourceStructureTest {

    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.input.InteractiveInputSource", withInterface("sandpile.input.InputSource"))
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldBr() {
        it.hasField("br: java.io.BufferedReader")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldDefDir() {
        it.hasField("defaultDirection: sandpile.utils.Direction")
        .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_ALL)
        .thatHasNo(GETTER, SETTER);
    }
    
    @Test
    @DisabledIf(notApplicable)
    public void constructor1() {
        it.hasConstructor(withNoArgs())
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor2() {
        it.hasConstructor(withArgs("source: java.io.Reader"))
            .thatIs(VISIBLE_TO_SUBCLASSES);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodNextDirection() {
        it.hasMethod("nextDirection", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("sandpile.utils.Direction");
    }
}

