
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class DirectionStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("sandpile.utils.Direction")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasEnumElements("UP", "RIGHT", "DOWN", "LEFT");
    }
}

