package vsu.polev.backend.user.model;

import jakarta.persistence.*;
import lombok.Data;
import vsu.polev.backend.listing.model.Listing;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Listing> listings;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_favorite",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "listing_id", referencedColumnName = "id"))
    private List<Listing> favoriteListings;

}
