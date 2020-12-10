package ups.edu.ec.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity
@Table(name = "Telefono")

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tel_cod")
    private int cod_tel;
	
	@Column(name="tel_numero", length=10, nullable=false, unique=true)
    private String numero;

	@ManyToOne
	@JoinColumn 
	Usuario usu_tel;
	
	@ManyToOne
	@JoinColumn
	Operadoras ope_tel;
	
	@ManyToOne
	@JoinColumn
	TipoTelefono tipo_tel ;
	
	public Telefono() {
		super();
	}

	public Telefono(int cod_tel, String numero, Usuario usu_tel, Operadoras ope_tel, TipoTelefono tipo_tel) {
		super();
		this.cod_tel = cod_tel;
		this.numero = numero;
		this.usu_tel = usu_tel;
		this.ope_tel = ope_tel;
		this.tipo_tel = tipo_tel;
	}

	public int getCod_tel() {
		return cod_tel;
	}

	public void setCod_tel(int cod_tel) {
		this.cod_tel = cod_tel;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsu_tel() {
		return usu_tel;
	}

	public void setUsu_tel(Usuario usu_tel) {
		this.usu_tel = usu_tel;
	}

	public Operadoras getOpe_tel() {
		return ope_tel;
	}

	public void setOpe_tel(Operadoras ope_tel) {
		this.ope_tel = ope_tel;
	}

	public TipoTelefono getTipo_tel() {
		return tipo_tel;
	}

	public void setTipo_tel(TipoTelefono tipo_tel) {
		this.tipo_tel = tipo_tel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod_tel;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((ope_tel == null) ? 0 : ope_tel.hashCode());
		result = prime * result + ((tipo_tel == null) ? 0 : tipo_tel.hashCode());
		result = prime * result + ((usu_tel == null) ? 0 : usu_tel.hashCode());
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
		Telefono other = (Telefono) obj;
		if (cod_tel != other.cod_tel)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (ope_tel == null) {
			if (other.ope_tel != null)
				return false;
		} else if (!ope_tel.equals(other.ope_tel))
			return false;
		if (tipo_tel == null) {
			if (other.tipo_tel != null)
				return false;
		} else if (!tipo_tel.equals(other.tipo_tel))
			return false;
		if (usu_tel == null) {
			if (other.usu_tel != null)
				return false;
		} else if (!usu_tel.equals(other.usu_tel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefono [cod_tel=" + cod_tel + ", numero=" + numero + ", usu_tel=" + usu_tel + ", ope_tel=" + ope_tel
				+ ", tipo_tel=" + tipo_tel + "]";
	}
	
	
   
}
