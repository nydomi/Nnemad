import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class PredefinedInputSourceStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.input.PredefinedInputSource",
                    withParent("sandpile.input.InteractiveInputSource"))
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withArgs("fileName: String"))
            .thatIs(VISIBLE_TO_ALL);
    }


}

