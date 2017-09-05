package jacklow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehiculos")
public class Vehiculo {
	
	@Id @GeneratedValue
	private long id;
	private String vtu;
	private String patente;

	@SuppressWarnings("unused")
	public Vehiculo(){
		
	}
	
	public Vehiculo(String vtu, String patente) {
		super();
		this.vtu = vtu;
		this.patente = patente;
	}

	public String getVtu() {
		return vtu;
	}

	public String getPatente() {
		return patente;
	}

}
