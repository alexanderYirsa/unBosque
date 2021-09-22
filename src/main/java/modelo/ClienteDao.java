package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import entidad.Clientes;


public class ClienteDao {
	
	private Conexion con;
	private Clientes cli;
	
	public ClienteDao() {
		this.con = new Conexion();
		this.cli = new Clientes();
	}
	//Crear Cliente
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
	
	//Listar Clientes
	public ArrayList<Clientes> listarClientes() {
		String strConsulta = "SELECT * FROM clientes";
		ArrayList<Clientes> nombreArrayList = new ArrayList<Clientes>();
		int registros = 0;
		try {
			PreparedStatement pstm = con.conectar().prepareStatement(strConsulta);
			ResultSet res = pstm.executeQuery();

			int cedula = 0;
			String nombres = "";
			String direccion = ""; 
			String correo = "";
			String telefono = "";

			int i = 0;
			while(res.next()){
				cedula = res.getInt("cedula_cliente");
				nombres = res.getString("nombre_cliente");
				direccion = res.getString("direccion_cliente");
				correo = res.getString("email_cliente");
				telefono = res.getString("telefono_cliente");
				i++;
				nombreArrayList.add(new Clientes(cedula, nombres, direccion, correo, telefono));	 
			}
			res.close();


		}catch(SQLException e){
			System.out.println(e);
		}

		catch (Exception ex){
			System.out.println(ex.toString());
		}
		return nombreArrayList;	 
	}

}
