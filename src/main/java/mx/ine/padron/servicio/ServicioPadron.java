package mx.ine.padron.servicio;

import java.util.List;

import mx.ine.padron.modelo.Persona;

public interface ServicioPadron {
	
	Persona findPersona(int id);
	
	List<Persona> recuperaTodasPersonas();
	Persona guarda(Persona per);
}


