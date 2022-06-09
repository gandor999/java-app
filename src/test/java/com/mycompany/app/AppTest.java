package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.calculator.Difference;
import com.mycompany.calculator.Product;
import com.mycompany.calculator.Sum;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static final double DELTA = 1e-15;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String[] stringArray = { "stub" };
        App.main(stringArray);
        assertTrue(true);
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(3, Sum.add(1, 2), DELTA);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(1, Difference.subtract(3, 2), DELTA);
    }

    // @Test
    // public void shouldMultiplyTwoNumbers() {
    //     assertEquals(6, Product.multiply(3, 2), DELTA);
    // }
}
