package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private final Triangle triangle = new Triangle(1,2,3,4, new Color(1,1,1));
    @Test
    public void getArea() {
        assertEquals(2.0D, triangle.getArea(), 0.01);
    }

    @Test
    public void getPerimeter() {
        assertEquals(6.0, triangle.getPerimeter(), 0.01);
    }
}