package crackingcoding.ch8recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TripleStepTest {

    @Test
    void testSteps() {
        TripleStep ts = new TripleStep();
        assertEquals(4, ts.getNumOfWays(3));
        assertEquals(7, ts.getNumOfWays(4));
    }

}
