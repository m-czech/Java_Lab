package org.example;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShapeService {
    private final ShapeRepository shapeRepository;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public Rectangle saveRectangle(Rectangle rectangle) {
        return shapeRepository.save(rectangle);
    }

    public List<Rectangle> getAllRectangles() {
        return shapeRepository.findAll();
    }
}
