package br.com.belemburitiricardo.gerenestobrejas.repository;

import br.com.belemburitiricardo.gerenestobrejas.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    Optional<Beer> findByName(String name);
}
//
