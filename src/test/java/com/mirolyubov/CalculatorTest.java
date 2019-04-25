package com.mirolyubov;

import com.mirolyubov.MyExceptions.BracketsException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Other")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void calculate() {
        assertEquals("4", calculator.calculate("2+2"));
    }

    @Test
    void calculateBadExpression() {
        assertEquals("", calculator.calculate("2+2+ABC"));
    }

    @Test
    void calculateBadOpenBrackets() {
        assertThrows(BracketsException.class, () -> {
            calculator.calculate("2+(2+8");
        });
    }
    @Test
    void calculateBadCloseBrackets() {
        assertThrows(BracketsException.class, () -> {
            calculator.calculate("2+2)+8");
        });
    }



}