package cl.martini.randomize.service;

import java.util.List;

import cl.martini.randomize.model.Comida;

public interface ComidasService {

	List<Comida> getDesayuno();
	
	List<Comida> getAlmuerzo();
	
	List<Comida> getOnce();
	
	List<Comida> getCena();
	
	
}
