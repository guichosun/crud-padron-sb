package mx.ine.padron.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ine.padron.modelo.Persona;
import mx.ine.padron.repositorio.RepositorioPersona;

@Service
public class ServicioPadronImpl implements ServicioPadron {

	// @Autowired
	// private RepositorioPersona repository;

	@Override
	public Persona findPersona(int id) {
		Persona pers = null;

		// if (id == 0) {
		// msg = new Persona(id, "Este es un mensaje predeterminado");
		// } else {
		System.out.println("Irá por el mensaje a bd: " + id);

		// Optional<Persona> op = repository.findById(id);

		// if(op.isPresent()) {
		// System.out.println("Encontrado");
		// pers = op.get();
		// }
		// }
		return pers;
	}

	@Override
	public List<Persona> recuperaTodasPersonas() {
		List<Persona> list = new ArrayList<Persona>();
		// repository.findAll().forEach(e -> list.add(e));
		System.out.println("Los registros encontrados son: " + list.size());
		return list;
	}

	@Override
	public Persona guarda(Persona per) {
		System.out.println("Guardara");
		return per;
		// return repository.save(per);
	}

}
