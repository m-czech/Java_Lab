package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {
    private final ShapeService shapeService;

    @Autowired
    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping
    public List<Rectangle> getAllShapes() {
        return shapeService.getAllRectangles();
    }

    @PostMapping
    public Rectangle createShape(@RequestBody Rectangle shape) {
        return shapeService.saveRectangle(shape);
    }
}
