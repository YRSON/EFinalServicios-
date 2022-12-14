package EfYersonSifuentes.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EfYersonSifuentes.idat.pe.model.Hospedaje;
import EfYersonSifuentes.idat.pe.repository.HospedajeRepositorio;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	
	@Autowired
	private HospedajeRepositorio repositorio;
	
	@Override
	public List<Hospedaje> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public void guardar(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		repositorio.save(hospedaje);
	}

}
