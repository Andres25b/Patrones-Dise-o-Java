package PatronFabrica.Implementaciones;

import PatronFabrica.Interfaz.IConexion;

public class ConexionPostgreSQL implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// AQUI PUEDE IR CODIGO JDBC
		System.out.println("Se conectů a PostgreSQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
