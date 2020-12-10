package ups.edu.ec.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

@Table(name = "Usuario")

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_cod")
    private int cod_usu;
	
	@Column(name="usu_cedula", length=10, nullable=false, unique=true)
    private String cedula;
	
	@Column(name="usu_nombre", length=50, nullable=false)
    private String nombre;	
	
	@Column(name="usu_apellido", length=10, nullable=false)
    private String apellido;
	
	@Column(name="usu_correo", length=10, nullable=false, unique=true)
    private String correo;
	
	@Column(name="usu_contrasena", length=10, nullable=false)
    private String contrasena;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "usu_tel")
	private List<Telefono> listaTelUsu = new ArrayList<Telefono>();
	
	
	
	public Usuario() {
		super();
	}



	public Usuario(int cod_usu, String cedula, String nombre, String apellido, String correo, String contrasena) {
		super();
		this.cod_usu = cod_usu;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
	}



	public int getCod_usu() {
		return cod_usu;
	}



	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}



	public List<Telefono> getListaTelUsu() {
		return listaTelUsu;
	}



	public void setListaTelUsu(List<Telefono> listaTelUsu) {
		this.listaTelUsu = listaTelUsu;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
	

	public void addListaTelUsu(Telefono listaTelUsu) {
		this.listaTelUsu.add(listaTelUsu);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + cod_usu;
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((listaTelUsu == null) ? 0 : listaTelUsu.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (cod_usu != other.cod_usu)
			return false;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (listaTelUsu == null) {
			if (other.listaTelUsu != null)
				return false;
		} else if (!listaTelUsu.equals(other.listaTelUsu))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Usuario [cod_usu=" + cod_usu + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correo=" + correo + ", contrasena=" + contrasena + ", listaTelUsu=" + listaTelUsu + "]";
	}
	
	
	
}
