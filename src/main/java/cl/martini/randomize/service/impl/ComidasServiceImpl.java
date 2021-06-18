package cl.martini.randomize.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.martini.randomize.model.Comida;
import cl.martini.randomize.repository.ComidasRepository;
import cl.martini.randomize.service.ComidasService;

@Service
public class ComidasServiceImpl implements ComidasService {

	@Autowired
	ComidasRepository comidasRepository;

	@Override
	public List<Comida> getDesayuno() {
		List<Comida> listaFruta = comidasRepository.findByCategoria("Fruta");
		List<Comida> listaLacteo = comidasRepository.findByCategoria("Lacteo");
		List<Comida> listaCereal = comidasRepository.findByCategoriaAndHorario("Cereal", "desayuno");
		List<Comida> listaARL = comidasRepository.findByCategoria("ARL");

		Random rand = new Random();

		ArrayList<Comida> listaDesayuno = new ArrayList<Comida>();
		listaDesayuno.add(listaFruta.get(rand.nextInt(listaFruta.size())));
		listaDesayuno.add(listaLacteo.get(rand.nextInt(listaLacteo.size())));
		listaDesayuno.add(listaCereal.get(rand.nextInt(listaCereal.size())));
		listaDesayuno.add(listaARL.get(rand.nextInt(listaARL.size())));
		return listaDesayuno;
	}

	@Override
	public List<Comida> getAlmuerzo() {
		List<Comida> listaVerduraGeneral = comidasRepository.findByCategoria("VerduraGeneral");
		List<Comida> listaVerduraLibre = comidasRepository.findByCategoria("VerduraLibre");
		List<Comida> listaAceite = comidasRepository.findByCategoria("Aceite");
		List<Comida> listaCereal = comidasRepository.findByCategoriaAndHorario("Cereal", "almuerzo");
		List<Comida> listaProteicos = comidasRepository.findByCategoria("Proteicos");

		Random rand = new Random();

		ArrayList<Comida> listaAlmuerzo = new ArrayList<Comida>();
		listaAlmuerzo.add(listaVerduraGeneral.get(rand.nextInt(listaVerduraGeneral.size())));
		listaAlmuerzo.add(listaVerduraLibre.get(rand.nextInt(listaVerduraLibre.size())));
		listaAlmuerzo.add(listaAceite.get(rand.nextInt(listaAceite.size())));
		listaAlmuerzo.add(listaCereal.get(rand.nextInt(listaCereal.size())));
		listaAlmuerzo.add(listaProteicos.get(rand.nextInt(listaProteicos.size())));

		return listaAlmuerzo;
	}

	@Override
	public List<Comida> getOnce() {
		List<Comida> listaFruta = comidasRepository.findByCategoria("Fruta");
		List<Comida> listaLacteo = comidasRepository.findByCategoria("Lacteo");
		List<Comida> listaCereal = comidasRepository.findByCategoriaAndHorario("Cereal", "desayuno");
		List<Comida> listaProteicos = comidasRepository.findByCategoria("Proteicos");
		Random rand = new Random();

		ArrayList<Comida> listaOnce = new ArrayList<Comida>();

		listaOnce.add(listaFruta.get(rand.nextInt(listaFruta.size())));
		listaOnce.add(listaLacteo.get(rand.nextInt(listaLacteo.size())));
		listaOnce.add(listaCereal.get(rand.nextInt(listaCereal.size())));
		listaOnce.add(listaProteicos.get(rand.nextInt(listaProteicos.size())));

		return listaOnce;
	}

	@Override
	public List<Comida> getCena() {
		List<Comida> listaVerduraGeneral = comidasRepository.findByCategoria("VerduraGeneral");
		List<Comida> listaVerduraLibre = comidasRepository.findByCategoria("VerduraLibre");
		List<Comida> listaAceite = comidasRepository.findByCategoria("Aceite");
		List<Comida> listaCereal = comidasRepository.findByCategoriaAndHorario("Cereal", "almuerzo");
		List<Comida> listaProteicos = comidasRepository.findByCategoria("Proteicos");

		Random rand = new Random();

		ArrayList<Comida> listaCena = new ArrayList<Comida>();
		listaCena.add(listaVerduraGeneral.get(rand.nextInt(listaVerduraGeneral.size())));
		listaCena.add(listaVerduraLibre.get(rand.nextInt(listaVerduraLibre.size())));
		listaCena.add(listaAceite.get(rand.nextInt(listaAceite.size())));
		listaCena.add(listaCereal.get(rand.nextInt(listaCereal.size())));
		listaCena.add(listaProteicos.get(rand.nextInt(listaProteicos.size())));

		return listaCena;
	}

}
