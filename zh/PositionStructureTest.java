import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class PositionStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("sandpile.utils.Position")
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 .thatHas(EQUALITY_CHECK);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldX() {
        it.hasField("x: int")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHas(GETTER)
            .thatHasNo(SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldY() {
        it.hasField("y: int")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHas(GETTER)
            .thatHasNo(SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldX_LOWER_BOUND() {
        it.hasField("X_LOWER_BOUND: int")
            .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER)
            .withInitialValue(0);//!!!!!!! MODOSITVA !!!!!
    }

    @Test 
    @DisabledIf(notApplicable)
    public void fieldX_UPPER_BOUND() {
        it.hasField("X_UPPER_BOUND: int")
            .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER)
            .withInitialValue(20); //!!!!!!! MODOSITVA !!!!!
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldY_LOWER_BOUND() {
        it.hasField("Y_LOWER_BOUND: int")
            .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER)
            .withInitialValue(0);//!!!!!!! MODOSITVA !!!!!
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldY_UPPER_BOUND() {
        it.hasField("Y_UPPER_BOUND: int")
            .thatIs(USABLE_WITHOUT_INSTANCE, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER)
            .withInitialValue(20);//!!!!!!! MODOSITVA !!!!!
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withArgs("x : int", "y : int"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void eq() {
        it.has(EQUALITY_CHECK);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodIsOutOfBound() {
        it.hasMethod("isOutOfBound", withParams("x : int", "y : int"))
          .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
          .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodMove() {
        it.hasMethod("move", withParams("dir : Direction"))
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodTurnDistance() {
        it.hasMethod("turnDistance", withParams("from : Position", "till : Position"))
          .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
          .thatReturns("int");
    }

    @Test //!!!!!!! HOZZAADVA !!!!!
    @DisabledIf(notApplicable)
    public void methodGetXOffset() {
        it.hasMethod("getXOffset", withParams("dir: Direction"))
          .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_NONE)
          .thatReturns("int");
    }

    @Test//!!!!!!! HOZZAADVA !!!!!
    @DisabledIf(notApplicable)
    public void methodGetYOffset() {
        it.hasMethod("getYOffset", withParams("dir: Direction"))
          .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_NONE)
          .thatReturns("int");
    }
}

