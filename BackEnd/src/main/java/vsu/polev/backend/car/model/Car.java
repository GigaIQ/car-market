package vsu.polev.backend.car.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.fuel_type.model.FuelType;
import vsu.polev.backend.gearbox.model.Gearbox;
import vsu.polev.backend.listing.model.Listing;
import vsu.polev.backend.mark.model.Mark;
import vsu.polev.backend.model.model.Model;
import vsu.polev.backend.transmission.model.Transmission;

@Data
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gearbox_id", referencedColumnName = "id")
    private Gearbox gearbox;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id", referencedColumnName = "id")
    private FuelType fuelType;

    @ManyToOne
    @JoinColumn(name = "transmission_id", referencedColumnName = "id")
    private Transmission transmission;

    @OneToOne
    @JoinColumn(name = "mark_id", referencedColumnName = "id")
    private Mark mark;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;

    @Column(name = "distance")
    private Long distance;

    @Column(name = "year")
    private Integer year;

    @Column(name = "damage")
    private boolean damage;

    @OneToOne(mappedBy = "car")
    private Listing listing;
}
