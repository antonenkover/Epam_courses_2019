package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    private Task1 instance;

    @Test
    public void shouldReturnDecimalValue() {
        assertEquals(instance.convertToDecimal("101"), 3);
    }

    @Test
    public void shouldReturnNegativeDecimalValue () {
        assertEquals(instance.convertToDecimal("-101"), -3);
    }

    @Test
    public void shouldReturnZeroWhenZeroIsEntered () {
        assertEquals(instance.convertToDecimal("0"), 0);
    }

}