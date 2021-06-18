package cl.martini.randomize.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO {

	List<Comida> listaDesayuno;

	List<Comida> listaAlmuerzo;

	List<Comida> listaOnce;
	
	List<Comida> listaCena;

}
