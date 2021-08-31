package com.sbrf.reboot.calculator;

import com.sbrf.reboot.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getAddition() {
        assertEquals(9, Calculator.getAddition(4, 5));
    }

    @Test
    void getSubtraction() {
        assertEquals(-1, Calculator.getSubtraction(4, 5));
    }

    @Test
    void getMultiplication() {
        assertEquals(20, Calculator.getMultiplication(4, 5));
    }

    @Test
    void getDivision() {
        assertEquals(3, Calculator.getDivision(9, 3));
    }

    @Test
    void getPercentage() {
        assertEquals(80, Calculator.getPercentage(4, 5));
    }

    @Test
    void getFahrenheit() {
        assertEquals(48, Calculator.getFahrenheitToCelsius(120));
    }

    @Test
    void getMedian() {
        assertEquals(3.0, Calculator.getMedian(new int[] {1, 2, 3, 4, 5}, 5));
    }

    @Test
    void classHasSevenMethods(){
        assertEquals(7,Calculator.class.getMethods().length-Object.class.getMethods().length);
    }
}