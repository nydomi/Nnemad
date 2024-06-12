import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class EntityStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.entity.Entity")
                 .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldPos() {
        it.hasField("position : sandpile.utils.Position")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(SETTER)
            .thatHas(GETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldInputSource() {
        it.hasField("inputSource: sandpile.input.InputSource")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor01() {
        it.hasConstructor(withArgs("x : int", "y : int", "inputSource : sandpile.input.InputSource"))
            .thatIs(VISIBLE_TO_SUBCLASSES);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodMove() {
        it.hasMethod("move", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("boolean");
    }
}

