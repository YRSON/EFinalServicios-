package EfYersonSifuentes.idat.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EfYersonSifuentes.idat.pe.model.Hospedaje;
import EfYersonSifuentes.idat.pe.service.HospedajeService;

@RestController
@RequestMapping("/api/hospedaje/v1")
public class HospedajeController {
	
	@Autowired
	private HospedajeService servicio;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Hospedaje>> listar(){		
		
		return new ResponseEntity<List<Hospedaje>>(servicio.listar(),HttpStatus.OK);		
	}
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Hospedaje hospedaje){
		
		servicio.guardar(hospedaje);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
