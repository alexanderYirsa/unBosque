package entidad;

public class Clientes {
	
	private int cedula;
	private String nombres;
	private String direccion;
	private String email;
	private String telefono;
	
	public Clientes() {
		
	}
	//Constructor
	public Clientes(int cedula, String nombres, String direccion, String email, String telefono) {
		
		this.cedula = cedula;
		this.nombres = nombres;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}

	//Métodos Get and Set
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Clientes [cedula=" + cedula + ", nombres=" + nombres + ", direccion=" + direccion + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
}
