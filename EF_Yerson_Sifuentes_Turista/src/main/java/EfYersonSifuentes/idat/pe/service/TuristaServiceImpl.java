package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EfYersonSifuentes.idat.pe.model.Turista;
import EfYersonSifuentes.idat.pe.repository.TuristaRepositorio;

@Service
public class TuristaServiceImpl implements TuristaServicio{
	
	@Autowired
	private TuristaRepositorio repositorio;

	@Override
	public List<Turista> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public void guardar(Turista turista) {
		repositorio.save(turista);
		
	}

	
	
	
}
