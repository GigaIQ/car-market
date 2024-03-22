package vsu.polev.backend.transmission.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;
import vsu.polev.backend.enums.GearboxType;
import vsu.polev.backend.enums.TransmissionType;

import java.util.List;

@Data
@Entity
@Table(name = "transmission")
public class Transmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "transmission_name")
    private TransmissionType transmissionType;

    @OneToMany(mappedBy = "transmission")
    private List<Car> cars;
}
