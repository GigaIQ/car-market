package vsu.polev.backend.user_favorite.mapper;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_favorite")
public class UserFavorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
