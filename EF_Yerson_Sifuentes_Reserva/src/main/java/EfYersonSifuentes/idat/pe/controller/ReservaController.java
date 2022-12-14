package EfYersonSifuentes.idat.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EfYersonSifuentes.idat.pe.model.Reserva;
import EfYersonSifuentes.idat.pe.service.ReservaService;

@RestController
@RequestMapping("/api/reserva/v1")
public class ReservaController {
	
	@Autowired
	private ReservaService servicio;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Reserva>> listar(){		
		
		return new ResponseEntity<List<Reserva>>(servicio.listar(),HttpStatus.OK);		
	}
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Reserva reserva){
		
		servicio.guardar(reserva);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
