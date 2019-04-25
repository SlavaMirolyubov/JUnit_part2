package com.mirolyubov;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Negative")
public class NegativeOperationsTest {

    @Test
    void getSymbolNotInEnum() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals("&", Operations.getEnum("&").getSymbol());
        });
    }

    @Test
    void getSymbol() {
        assertNotEquals("$", Operations.PLUS.getSymbol());
    }

}
