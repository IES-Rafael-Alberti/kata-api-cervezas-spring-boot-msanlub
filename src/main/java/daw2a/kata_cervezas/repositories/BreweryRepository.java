package daw2a.kata_cervezas.repositories;

import daw2a.kata_cervezas.entities.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BreweryRepository extends JpaRepository<Brewery, Long> {
    //por nombre
    List<Brewery> findByNameContainingIgnoreCase(String name);

    //por ciudad
    List<Brewery> findByCityContainingIgnoreCase(String city);
}
