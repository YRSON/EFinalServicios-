package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import EfYersonSifuentes.idat.pe.model.Hospedaje;


public interface HospedajeService {
	
	List<Hospedaje> listar();

	void guardar(Hospedaje hospedaje);
	
}	
