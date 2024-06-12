import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class InputSourceStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theInterface("sandpile.input.InputSource")
                 .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodNextDirection() {
        it.hasMethod("nextDirection", withNoParams())
          .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("sandpile.utils.Direction");
    }
}

