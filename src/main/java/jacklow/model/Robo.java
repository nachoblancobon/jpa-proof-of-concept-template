package jacklow.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateTimeConverter;

@Entity
public class Robo {
	
	@Id @GeneratedValue
	private Long Id;
	
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime fecha;
	

	@ManyToOne(fetch = FetchType.LAZY)
	private Vehiculo vehiculo;

	@ManyToMany
	@OrderColumn
	//@JoinColumn(name = "robo_id") // para no generar tabla intermedia 
	private List<Movil> moviles;
	
	private String denunciante;
	private String operador;
	private String zona;
	private String codigoDenuncia;

	public Robo(){
		super();
		this.setFecha(LocalDateTime.now());
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getDenunciante() {
		return denunciante;
	}

	public String getOperador() {
		return operador;
	}

	public String getZona() {
		return zona;
	}

	public String getCodigoDenuncia() {
		return codigoDenuncia;
	}

}
