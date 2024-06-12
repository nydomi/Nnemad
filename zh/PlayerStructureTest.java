import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class PlayerStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.entity.Player", withParent("sandpile.entity.Entity"))
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withArgs("position : sandpile.utils.Position", "inputSource: sandpile.input.InputSource"))
            .thatIs(VISIBLE_TO_ALL);
    }
}

