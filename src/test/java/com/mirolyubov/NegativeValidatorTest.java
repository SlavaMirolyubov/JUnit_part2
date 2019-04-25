package com.mirolyubov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Negative")
public class NegativeValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }

    @Test
    void isNumberStroke() {
        assertFalse(validator.isNumber("string"));
    }

    @Test
    void isNumberEmpty() {
        assertFalse(validator.isNumber(""));
    }

    @Test
    void isNumberSeparator() {
        assertFalse(validator.isNumber(" "));
    }

    @Test
    void validateNotNumbers() {
        assertFalse(validator.validate("5*9-7+3/7*slovo"));
    }

    @Test
    void validateOpsBetweenBrackets() {
        assertFalse(validator.validate("5*9-7+(*(3/7)"));
    }

    @Test
    void validateDoubleOperators() {
        assertFalse(validator.validate("5*9--7+3/7"));
    }

    @Test
    void validateNumNearBrackets() {
        assertFalse(validator.validate("5*9-8(7+3/7)"));
    }
}
