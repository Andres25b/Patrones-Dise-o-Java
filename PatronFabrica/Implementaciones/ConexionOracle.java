package PatronFabrica.Implementaciones;

import PatronFabrica.Interfaz.IConexion;

public class ConexionOracle implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// AQUI PUEDE IR CODIGO JDBC
		System.out.println("Se conectů a Oracle");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
