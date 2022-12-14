package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import EfYersonSifuentes.idat.pe.model.Reserva;

public interface ReservaService {
	
	List<Reserva> listar();

	void guardar(Reserva reserva);
	
}
