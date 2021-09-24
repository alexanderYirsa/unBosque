package co.edu.co.unbosque.model;

public class Usuario {
	
	private int cedulaUsuario;
	private String nombreCompleto;
	private String emailUsuario;
	private String usuario;
	private String password;
	
	
		
	public Usuario(int cedula,String nombreCom, String email, String usuario, String password) {
		this.cedulaUsuario=cedula;
		this.nombreCompleto=nombreCom;
		this.emailUsuario=email;
		this.usuario=usuario;
		this.password=password;
		
	}
	
	public int getCedulaUsuario() {
		return cedulaUsuario;
	}



	public void setCedulaUsuario(int cedula_usuario) {
		this.cedulaUsuario = cedula_usuario;
	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public String getEmailUsuario() {
		return emailUsuario;
	}



	public void setEmailUsuario(String email_usuario) {
		this.emailUsuario = email_usuario;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

}
