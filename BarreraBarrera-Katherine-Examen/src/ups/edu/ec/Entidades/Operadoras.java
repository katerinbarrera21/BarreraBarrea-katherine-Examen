package ups.edu.ec.Entidades;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadoras
 *
 */
@Entity
@Table(name = "Operadoras")

public class Operadoras implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ope_cod")
    private int opeCod;
	
	@Column(name="ope_nombre", length=10, nullable=false, unique=true)
    private String opeNombre;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "ope_tel")
	private List<Telefono> listaTelOpe = new ArrayList<Telefono>();
	
	public Operadoras() {
		super();
		
	}

	public Operadoras(int opeCod, String opeNombre) {
		super();
		this.opeCod = opeCod;
		this.opeNombre = opeNombre;
	}

	public int getOpeCod() {
		return opeCod;
	} 

	public void setOpeCod(int opeCod) {
		this.opeCod = opeCod;
	}

	public String getOpeNombre() {
		return opeNombre;
	}

	public void setOpeNombre(String opeNombre) {
		this.opeNombre = opeNombre;
	}

	public List<Telefono> getListaTelOpe() {
		return listaTelOpe;
	}

	public void setListaTelOpe(List<Telefono> listaTelOpe) {
		this.listaTelOpe = listaTelOpe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
