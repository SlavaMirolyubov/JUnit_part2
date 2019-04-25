package com.mirolyubov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Positive")
class PriorityTest {

    private Priority priority;

    @BeforeEach
    void setUp() {
        priority = new Priority();
    }

    @AfterEach
    void tearDown() {
        priority = null;
    }

    @Test
    void getPriorityDivide() {
        assertEquals(3, priority.getPriority("/"));
    }

    @Test
    void getPriorityMultiply() {
        assertEquals(3, priority.getPriority("*"));
    }

    @Test
    void getPriorityMinus() {
        assertEquals(2, priority.getPriority("-"));
    }

    @Test
    void getPriorityPlus() {
        assertEquals(2, priority.getPriority("+"));
    }

    @Test
    void getPriorityOpenBracket() {
        assertEquals(1, priority.getPriority("("));
    }

    @Test
    void getPriorityOther() {
        assertEquals(0, priority.getPriority(")"));
    }
}