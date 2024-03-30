package vsu.polev.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.polev.backend.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
