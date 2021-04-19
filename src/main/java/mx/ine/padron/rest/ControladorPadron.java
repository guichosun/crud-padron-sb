package mx.ine.padron.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.ine.padron.exception.MessageNotFoundException;
import mx.ine.padron.modelo.Persona;
import mx.ine.padron.servicio.ServicioPadron;

/**
 * @author guichosun
 *
 */
@RestController
@RequestMapping("/personas")
public class ControladorPadron {

	@Autowired
	private ServicioPadron applicationService;
    
	@GetMapping
	@CrossOrigin
    public ResponseEntity<List<Persona>> getAllPadron() {
		// TODO: Traer a todas las personas
        return new ResponseEntity<List<Persona>>(applicationService.recuperaTodasPersonas(), HttpStatus.OK);
    }
	
	@PostMapping
	@CrossOrigin
	public ResponseEntity<Persona> postPersonaAlPadron(@RequestBody Persona per) {
		System.out.println("Entro al metodo get con el parametro: "+per.getNombreCompleto());
		return new ResponseEntity<Persona>(applicationService.guarda(per),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	public ResponseEntity<Persona> getPersona(@PathVariable("id") int id) {
		
		// TODO: Traer a una sola persona por el id
		
		try {
//			return new ResponseEntity<Message>(HttpStatus.OK);
System.out.println("Entro al metodo get con el parametro: "+id);
            return new ResponseEntity<Persona>(applicationService.findPersona(id), HttpStatus.OK);
		} catch (MessageNotFoundException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mensaje no encontrado");
		}
	}
}
