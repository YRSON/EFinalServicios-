package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import EfYersonSifuentes.idat.pe.model.Turista;

public interface TuristaServicio {

	List<Turista> listar();

	void guardar(Turista turista);
}
