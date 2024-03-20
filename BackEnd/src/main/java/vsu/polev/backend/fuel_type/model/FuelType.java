package vsu.polev.backend.fuel_type.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;

import java.util.List;

@Data
@Entity
@Table(name = "fuel_type")
public class FuelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type_name")
    private vsu.polev.backend.enums.FuelType fuelType;

    @OneToMany(mappedBy = "fuelType")
    private List<Car> cars;

}

