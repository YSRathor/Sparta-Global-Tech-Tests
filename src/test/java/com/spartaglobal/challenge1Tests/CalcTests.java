package com.spartaglobal.challenge1Tests;

import com.spartaglobal.challenge1.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTests
{
    Calculator calc = new Calculator();

    @Test
    public void testAdd()
    {
        assertEquals(4,calc.add(2,2));
    }

    @Test
    public void testSubtract()
    {
        assertEquals(2,calc.subtract(4,2));
    }

    @Test
    public void testMultiply()
    {
        assertEquals(8,calc.multiply(4,2));
    }

    @Test
    public void testDivide()
    {
        assertEquals(3,calc.divide(6,2));
    }

}
