package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private final Logger _logger;

    public ShapeDescriber() {
        this._logger = LoggerFactory.getLogger(ShapeDescriber.class);
    }
    public void describe(Shape shape) {
        _logger.info("test");
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
