package lab0;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestVariant4 {

    @Test
    public void IntegerTest(){
        assertEquals(new Variant4().integerNumbersTask(10,3), 3);
    }

    ////////////////////////////////////////////////

    @Test
    public void BooleanTestBothTrue() {
        assertTrue(new Variant4().booleanTask(4, 6), "Both True");
    }

    @Test
    public void BooleanTestBothFalse() {
        assertFalse(new Variant4().booleanTask(1, 2), "Both False");
    }

    @Test
    public void BooleanTestOneTrueOneFalse() {
        assertFalse(new Variant4().booleanTask(1, 6), "One True, One False");
    }

    ////////////////////////////////////////////////

    @Test
    public void ifTestThree() {
        assertEquals(new Variant4().ifTask(13,66,497), 3);
    }

    @Test
    public void ifTestTwo() {
        assertEquals(new Variant4().ifTask(13,-2,497), 2);
    }

    @Test
    public void ifTestOne() {
        assertEquals(new Variant4().ifTask(13,-2,-10), 1);
    }

    @Test
    public void ifTestZero() {
        assertEquals(new Variant4().ifTask(-7,-2,-10), 0);
    }

    //////////////////////////////////////////////////

    @Test
    public void forTest() {
        assertEquals(new Variant4().forTask(56.7), 737.1);
    }

    //////////////////////////////////////////////////

    @Test
    public void whileTestTrue() {
        assertTrue(new Variant4().whileTask(27), "Number is degree of 3");
    }

    @Test
    public void whileTestFalse() {
        assertFalse(new Variant4().whileTask(28), "Number is not degree of 3");
    }

    ///////////////////////////////////////////////////

    @Test
    public void arrayTest() {
        double[] testArray = {2, 14, 98, 686, 4802, 33614};
        assertEquals(new Variant4().arrayTask(6, 2, 7), testArray);
    }

    ///////////////////////////////////////////////////

    @Test
    public void caseTest() {
        assertEquals(new Variant4().caseTask(2), 28);
    }

    //////////////////////////////////////////

    @Test
    public void matrixTest() {
        int[] testArray = {1, 4, 5, 7, 8, 9};

        int[][] expectedMatrix = {
                {1, 4, 5, 7, 8, 9},
                {1, 4, 5, 7, 8, 9},
                {1, 4, 5, 7, 8, 9},
                {1, 4, 5, 7, 8, 9},
                {1, 4, 5, 7, 8, 9}
        };
        assertEquals(new Variant4().twoDimensionArrayTask(5, testArray, 6), expectedMatrix);
    }

}