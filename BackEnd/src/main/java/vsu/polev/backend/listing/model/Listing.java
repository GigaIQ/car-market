package vsu.polev.backend.listing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.car.model.Car;
import vsu.polev.backend.mark.model.Mark;
import vsu.polev.backend.model.model.Model;
import vsu.polev.backend.user.model.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;

    @Column(name = "listing_date")
    private Timestamp listingDate;

    @Column(name = "listing_images")
    private String imagePass;

    @OneToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @JsonIgnore
    @ManyToMany(mappedBy = "favoriteListings")
    private List<User> users;
}
