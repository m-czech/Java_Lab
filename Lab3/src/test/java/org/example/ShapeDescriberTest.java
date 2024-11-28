package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShapeDescriberTest {

    ShapeDescriber shapeDescriber;
    @Before
    public void setUp() throws Exception {
        shapeDescriber = new ShapeDescriber();
    }

    @Test
    public void describe() {
        var shape = mock(Rectangle.class);
        shapeDescriber.describe(shape);
        verify(shape).getArea();
        verify(shape).getPerimeter();
    }
}