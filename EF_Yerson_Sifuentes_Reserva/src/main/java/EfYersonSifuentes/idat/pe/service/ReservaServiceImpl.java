package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import EfYersonSifuentes.idat.pe.model.Reserva;
import EfYersonSifuentes.idat.pe.repository.ReservaRepositorio;

public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepositorio repositorio;
	
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public void guardar(Reserva reserva) {
		// TODO Auto-generated method stub
		repositorio.save(reserva);
	}

}
