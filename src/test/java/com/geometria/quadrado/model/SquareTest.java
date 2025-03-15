package com.geometria.quadrado.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(3.0);
    }

    @Test
    void testCalculateArea() {
        assertEquals(9.0, square.calculateArea());
    }

    @Test
    void testCalculatePerimeter() {
        assertEquals(12.0, square.calculatePerimeter());
    }
}
