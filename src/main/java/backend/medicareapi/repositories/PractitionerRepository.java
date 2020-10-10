package backend.medicareapi.repositories;

import backend.medicareapi.models.Practitioners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PractitionerRepository extends JpaRepository<Practitioners, Integer> {
}
