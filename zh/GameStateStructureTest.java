import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class GameStateStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("sandpile.GameState")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasEnumElements("GAME_ONGOING", "PLAYER_LOST", "PLAYER_WON");
    }
}

