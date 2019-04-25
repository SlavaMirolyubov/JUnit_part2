package com.mirolyubov;

import com.mirolyubov.MyExceptions.DivideByZeroException;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Positive")
class PositiveOperationsTest {

    @Test
    void getSymbol() {
        assertEquals("/", Operations.DIVIDE.getSymbol());
    }

    @Test
    void getSymbolPlus() {
        assertEquals("+", Operations.getEnum("+").getSymbol());
    }

    @Test
    void getSymbolMinus() {
        assertEquals("-", Operations.getEnum("-").getSymbol());
    }

    @Test
    void getSymbolDivide() {
        assertEquals("/", Operations.getEnum("/").getSymbol());
    }

    @Test
    void getSymbolMultiply() {
        assertEquals("*", Operations.getEnum("*").getSymbol());
    }

    @Test
    void divide() {
        assertEquals(BigDecimal.valueOf(5), Operations.getEnum("/").apply(BigDecimal.valueOf(20), BigDecimal.valueOf(4)));
    }

    @Test
    void divideByZero() {
        assertThrows(DivideByZeroException.class, () -> {
            Operations.getEnum("/").apply(BigDecimal.valueOf(20), BigDecimal.valueOf(0));
        });
    }

    @Test
    void multiply() {
        assertEquals(BigDecimal.valueOf(36), Operations.getEnum("*").apply(BigDecimal.valueOf(4), BigDecimal.valueOf(9)));
    }

    @Test
    void minus() {
        assertEquals(BigDecimal.valueOf(5), Operations.getEnum("-").apply(BigDecimal.valueOf(10), BigDecimal.valueOf(5)));
    }

    @Test
    void plus() {
        assertEquals(BigDecimal.valueOf(15), Operations.getEnum("+").apply(BigDecimal.valueOf(10), BigDecimal.valueOf(5)));
    }



}