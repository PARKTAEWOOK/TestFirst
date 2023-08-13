package liveStudy.ShinsegaeTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SImpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqual(){
        var calculator = new SImpleCalculator();
        assertEquals(4,calculator.add(2,2));
//        assertTrue(calculator.add(3,4));
    }

}