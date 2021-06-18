package cl.martini.randomize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.martini.randomize.model.GenericResponseDTO;
import cl.martini.randomize.service.ComidasService;

@RestController
public class GenericController {

	@Autowired
	ComidasService comidasService;

	@GetMapping("/getRandomize")
	public GenericResponseDTO getRandomize() {
		GenericResponseDTO response = new GenericResponseDTO();
		response.setListaDesayuno(comidasService.getDesayuno());
		response.setListaAlmuerzo(comidasService.getAlmuerzo());
		response.setListaOnce(comidasService.getOnce());
		response.setListaCena(comidasService.getCena());
		return response;
	}

}
