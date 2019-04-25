package com.mirolyubov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Positive")
class NormalizerTest {

    private Normalizer normalizer;

    @BeforeEach
    void setUp() {
        normalizer = new Normalizer();
    }

    @AfterEach
    void tearDown() {
        normalizer = null;
    }

    @Test
    void normalizeExpression() {
        assertEquals("0-8/(35.9+2*7/(0-2))-9*2", normalizer.normalizeExpression(" - 8/(35,9 +2*7/(-2))-9 *2"));
    }
}