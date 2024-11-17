package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private final Rectangle rectangle = new Rectangle(1,2, new Color(1,1,1));

    @Test
    public void getArea() {
        assertEquals(rectangle.getArea(), 2.0D, 0.01);
    }

    @Test
    public void getPerimeter() {
        assertEquals(rectangle.getPerimeter(), 6.0D, 0.01);
    }
}