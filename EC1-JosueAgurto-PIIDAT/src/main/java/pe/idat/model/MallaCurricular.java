package pe.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="mallacurricular")
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idmalla;
	
	private String anio;
	
	@OneToOne
	private Universidad universidad;
	
	@OneToMany(mappedBy = "mallacurricular")
	private List<Curso> cursos =new ArrayList<>();

	public Integer getIdmalla() {
		return idmalla;
	}

	public void setIdmalla(Integer idmalla) {
		this.idmalla = idmalla;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	

}
