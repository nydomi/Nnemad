import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class SandPileGameStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.SandPileGame")
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldPlayer() {
        it.hasField("player: sandpile.entity.Player")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldWorms() {
        it.hasField("worms: java.util.List of sandpile.entity.Worm")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldRandom() {
        it.hasField("random: Random")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldState() {
        it.hasField("state: GameState")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor01() {
        it.hasConstructor(withArgs("wormsInput    : array of sandpile.input.PredefinedInputSource",
                                   "playerInput   : sandpile.input.PredefinedInputSource",
                                   "wormsPosition : array of sandpile.utils.Position"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor02() {
        it.hasConstructor(withArgs("wormsCounter : int"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodGetGameState() {
        it.hasMethod("getGameState", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("GameState");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodRandomPosition() {
        it.hasMethod("randomPosition", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_NONE)
          .thatReturns("sandpile.utils.Position");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodTurn() {
        it.hasMethod("turn", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("sandpile.GameState");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodWormsGotPlayer() {
        it.hasMethod("wormsGotPlayer", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_NONE)
          .thatReturns("boolean");
    }
}

