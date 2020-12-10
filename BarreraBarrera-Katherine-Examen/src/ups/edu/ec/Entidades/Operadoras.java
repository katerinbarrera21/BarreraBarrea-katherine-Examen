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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaTelOpe == null) ? 0 : listaTelOpe.hashCode());
		result = prime * result + opeCod;
		result = prime * result + ((opeNombre == null) ? 0 : opeNombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operadoras other = (Operadoras) obj;
		if (listaTelOpe == null) {
			if (other.listaTelOpe != null)
				return false;
		} else if (!listaTelOpe.equals(other.listaTelOpe))
			return false;
		if (opeCod != other.opeCod)
			return false;
		if (opeNombre == null) {
			if (other.opeNombre != null)
				return false;
		} else if (!opeNombre.equals(other.opeNombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Operadoras [opeCod=" + opeCod + ", opeNombre=" + opeNombre + ", listaTelOpe=" + listaTelOpe + "]";
	}
}
