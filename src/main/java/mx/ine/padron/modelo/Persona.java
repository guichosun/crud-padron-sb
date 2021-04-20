package mx.ine.padron.modelo;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity(name = "personas")
public class Persona {

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name="id")
	private int id;

	// @Column(name = "nom_completo", nullable = false)
	private String nombreCompleto;

	// @Column(name = "edad", nullable = false)
	private int edad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
