package PatronFabrica.Implementaciones;

import PatronFabrica.Interfaz.IConexion;

public class ConexionMySQL implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// AQUI PUEDE IR CODIGO JDBC
		System.out.println("Se conectů a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	
}
