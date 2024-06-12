import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import sandpile.SandPileGameTest;
import sandpile.utils.PositionTest;

@SelectClasses({
      SandpileTestSuite.StructuralTests.class
    , SandpileTestSuite.FunctionalTests.class
})
@Suite public class SandpileTestSuite {
    @SelectClasses({
          GameStateStructureTest.class
        
        , DirectionStructureTest.class
        , PositionStructureTest.class

        , InputSourceStructureTest.class
        , InteractiveInputSourceStructureTest.class
        , PredefinedInputSourceStructureTest.class
        , RandomInputSourceStructureTest.class

        , EntityStructureTest.class
        , PlayerStructureTest.class

        , WormStructureTest.class

        , SandPileGameStructureTest.class
    })
    @Suite public static class StructuralTests {}

    @SelectClasses({
        SandPileGameTest.class,
        PositionTest.class
    })
    @Suite public static class FunctionalTests {}
}
