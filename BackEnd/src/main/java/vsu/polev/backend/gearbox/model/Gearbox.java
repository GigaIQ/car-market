package vsu.polev.backend.gearbox.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;
import vsu.polev.backend.enums.GearboxType;

import java.util.List;


@Data
@Entity
@Table(name = "gearbox")
public class Gearbox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "gearbox_name")
    private GearboxType gearboxType;

    @OneToMany(mappedBy = "gearbox")
    private List<Car> cars;

}
