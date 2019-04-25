package com.mirolyubov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Positive")
class PositiveValidatorTest {

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
    void isNumber() {
        assertTrue(validator.isNumber("2.55"));
    }

    @Test
    void isNumberDouble() {
        assertTrue(validator.isNumber("1.0"));
    }

    @Test
    void isNumberInt() {
        assertTrue(validator.isNumber("55"));
    }

    @Test
    void validate() {
        assertTrue(validator.validate("5*9-7+3/7"));
    }

    @Test
    void validateBrackets() {
        assertTrue(validator.validate("2+(9*(17.3-8*3.7)-19*(18-7))"));
    }
}