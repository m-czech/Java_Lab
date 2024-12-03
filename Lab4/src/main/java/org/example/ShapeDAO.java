package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "Shape")
public class ShapeDAO {
    @Id
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;
}
