package cl.martini.randomize.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.martini.randomize.model.Comida;

@Repository
public interface ComidasRepository extends JpaRepository<Comida, Long> {
	
	List<Comida> findByCategoria(String categoria);
	List<Comida> findByCategoriaAndHorario(String categoria, String horario);

}
