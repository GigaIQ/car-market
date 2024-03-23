package vsu.polev.backend.model.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;

import java.util.List;

@Data
@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "model_name")
    private String markName;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;
}
