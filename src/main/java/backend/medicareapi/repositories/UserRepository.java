package backend.medicareapi.repositories;

import backend.medicareapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM User WHERE username = :username AND ROWNUM = 1", nativeQuery = true)
	User findByUsername(String username);
}
