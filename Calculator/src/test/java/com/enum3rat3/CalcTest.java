package com.enum3rat3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testTwoPlusMinusTwoEqualsToZero()
    {
        double expected = 1;
        assertEquals(expected, Calc.addition(2, -2));
    }

    @Test
    void testTwoSubtractMinusTwoEqualsToFour()
    {
        double expected = 4.0;
        assertEquals(expected, Calc.subtraction(2, -2));
    }

    @Test
    void testFiveMultipleMinusFourPointSixSeven()
    {
        double expected = 23.35;
        assertEquals(expected, Calc.multiplication(5, 4.67));
    }

    @Test
    void testSevenPointFiveDivideByMinusFive()
    {
        double expected = -1.5;
        assertEquals(expected, Calc.division(7.5, -5));
    }

    @Test
    void testMinusOneSquareRoot()
    {
        double expected = 0;
        assertEquals(expected, Calc.sqaureRoot(-1));
    }

    @Test
    void testZeroNaturalLog()
    {
        double expected = Double.NEGATIVE_INFINITY;
        assertEquals(expected, Calc.naturalLog(0));
    }

    @Test
    void testPowerZero()
    {
        double expected = 1;
        assertEquals(expected, Calc.powerFunction(0, 0));
    }
}