package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import entidad.Clientes;


public class ClienteDao {
	
	private Conexion con;
	private Clientes cli;
	
	public ClienteDao() {
		this.con = new Conexion();
		this.cli = new Clientes();
	}
	
	public void crearCliente(Clientes unCliente) {
		int cedula = unCliente.getCedula();
		String nombres = unCliente.getNombres();
		String direccion = unCliente.getDireccion();
		String correo = unCliente.getEmail();
		String telefono = unCliente.getTelefono();
		String registroCliente = "INSERT INTO clientes(cedula_cliente, nombre_cliente, direccion_cliente, email_cliente, telefono_cliente) VALUES (?,?,?,?,?)";

		try {
			PreparedStatement inst = con.conectar().prepareStatement(registroCliente);		
			inst.setInt(1, cedula);
			inst.setString(2, nombres);
			inst.setString(3, direccion);
			inst.setString(4, correo);
			inst.setString(5, telefono);
			inst.executeUpdate();
		}
		catch(SQLException e){
			System.out.println(e);
		}

		catch (Exception ex){
			System.out.println(ex.toString());
		} 

	}

}
