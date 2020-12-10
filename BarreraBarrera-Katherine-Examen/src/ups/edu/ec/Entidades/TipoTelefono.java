package ups.edu.ec.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TipoTelefono
 *
 */
@Entity
@Table(name = "TipoTelefono")

public class TipoTelefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tipTel_cod")
    private int codTipo;
	
	@Column(name="tipTel_tipo", length=10, nullable=false, unique=true)
    private String tipo;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "tipo_tel")
	private List<Telefono> listaTelTipo = new ArrayList<Telefono>();

	public TipoTelefono() {
		super();
	}

	public TipoTelefono(int codTipo, String tipo) {
		super();
		this.codTipo = codTipo;
		this.tipo = tipo;
	}

	public int getCodTipo() {
		return codTipo;
	}

	public void setCodTipo(int codTipo) {
		this.codTipo = codTipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Telefono> getListaTelTipo() {
		return listaTelTipo;
	}

	public void setListaTelTipo(List<Telefono> listaTelTipo) {
		this.listaTelTipo = listaTelTipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addListaTelTipo(Telefono listaTelTipo) {
		this.listaTelTipo.add(listaTelTipo);
	}

	
	
	
   
}
