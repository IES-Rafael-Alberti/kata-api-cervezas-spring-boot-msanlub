package daw2a.kata_cervezas.repositories;

import daw2a.kata_cervezas.entities.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StyleRepository extends JpaRepository<Style, Long> {
    List<Style> findByStyleNameContainingIgnoreCase(String styleName);
}