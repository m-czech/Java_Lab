package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "Shape")
public class Shape {
    @Id
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name;
    }
}
