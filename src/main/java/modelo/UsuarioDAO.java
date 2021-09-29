package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import entidad.Usuario;


public class UsuarioDAO {
	
	private static final String SQL_SELECT="SELECT cedula,nombres,email,usuario,password from usuarios";
	private static final String SQL_SELECT_BY_CC="SELECT cedula,nombres,email,usuario,password from usuarios WHERE cedula=?";
	private static final String SQL_INSERT="INSERT INTO usuarios(cedula,nombres,email,usuario,password) VALUES(?,?,?,?,?)";
	private static final String SQL_UPDATE="UPDATE usuarios SET nombres=?, email=?, usuario=?, password=? WHERE cedula=?";
	private static final String SQL_DELETE="DELETE FROM usuarios WHERE cedula=?";
	private Conexion con;
	
	public UsuarioDAO() {
		this.con=new Conexion();
	}
	public List<Usuario> (){
//		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		List<Usuario> usuarios=new ArrayList<Usuario>();
		
		try {
			con=Conexion.conectar();
			stmt=con.prepareStatement(SQL_SELECT);
			rs=stmt.executeQuery();
			
			while(rs.next()) {
				int cedula=rs.getInt("cedula");
				String nombres=rs.getString("nombres");
				String email=rs.getString("email");
				String usuario=rs.getString("usuario");
				String password=rs.getString("password");
				
				
			usuarios.add(new Usuario(cedula,nombres,email,usuario,password));
			}
			
		}catch(Exception e) {
			e.printStackTrace(System.out);
		}
		return usuarios;
	}
	
	public Usuario buscarUsuario(Usuario usuario) {
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=Conexion.getConexion();
			stmt=conn.prepareStatement(SQL_SELECT_BY_CC);
			stmt.setInt(1,usuario.getCedulaUsuario());
			rs=stmt.executeQuery();
			
			rs.next();
			String nombres=rs.getString("nombres");
			String email=rs.getString("email");
			String usuario1=rs.getString("usuario");
			String password=rs.getString("password");
			
			
			usuario.setNombreCompleto(nombres);
			usuario.setEmailUsuario(email);
			usuario.setUsuario(usuario1);
			usuario.setPassword(password);
			
					
		}catch (Exception e){
			e.printStackTrace(System.out);
		}
		
		return usuario;
		
	}
	
	public int insertarUsuario(Usuario usuario) {
		Connection conn=null;
		PreparedStatement stmt=null;
		int rows=0;
		
		try {
			conn=Conexion.getConexion();
			stmt=conn.prepareStatement(SQL_INSERT);
			stmt.setInt(1,usuario.getCedulaUsuario());
			stmt.setString(2,usuario.getNombreCompleto());
			stmt.setString(3,usuario.getEmailUsuario());
			stmt.setString(4,usuario.getUsuario());
			stmt.setString(5,usuario.getPassword());
			
			
			rows=stmt.executeUpdate();
					
		}catch (Exception e){
			e.printStackTrace(System.out);
		}
		return rows;
	}
	
	public int actualizarUsuario(Usuario usuario) {
		Connection conn=null;
		PreparedStatement stmt=null;
		int rows=0;
		
		try {
			conn=Conexion.getConexion();
			stmt=conn.prepareStatement(SQL_UPDATE);
			stmt.setInt(1,usuario.getCedulaUsuario());
			
			rows=stmt.executeUpdate();
					
		}catch (Exception e){
			e.printStackTrace(System.out);
		}
		return rows;
	}
	
	public int eliminarUsuario(Usuario usuario) {
		
		Connection conn=null;
		PreparedStatement stmt=null;
		int rows=0;
		
		try {
			conn=Conexion.getConexion();
			stmt=conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1,usuario.getCedulaUsuario());
			
			rows=stmt.executeUpdate();
					
		}catch (Exception e){
			e.printStackTrace(System.out);
		}
		return rows;
	}

}
