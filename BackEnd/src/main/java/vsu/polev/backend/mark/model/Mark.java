package vsu.polev.backend.mark.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;

@Data
@Entity
@Table(name = "mark")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mark_name")
    private String markName;

    @OneToOne(mappedBy = "mark")
    private Car car;
}
