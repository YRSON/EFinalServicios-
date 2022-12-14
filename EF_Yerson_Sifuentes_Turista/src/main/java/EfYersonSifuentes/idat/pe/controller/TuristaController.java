package EfYersonSifuentes.idat.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EfYersonSifuentes.idat.pe.model.Turista;
import EfYersonSifuentes.idat.pe.service.TuristaServicio;

@RestController
@RequestMapping("/api/turista/v1")
public class TuristaController {
	
	@Autowired
	private TuristaServicio servicio;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Turista>> listar(){		
		
		return new ResponseEntity<List<Turista>>(servicio.listar(),HttpStatus.OK);		
	}
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Turista turista){
		
		servicio.guardar(turista);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
