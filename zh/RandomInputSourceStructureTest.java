import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class RandomInputSourceStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.input.RandomInputSource", withInterface("sandpile.input.InputSource"))
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldRand() {
        it.hasField("rand: Random")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldAllDir() {
        it.hasField("allDir: array of sandpile.utils.Direction")
            .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withNoArgs())
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodNextDirection() {
        it.hasMethod("nextDirection", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("sandpile.utils.Direction");
    }
}

