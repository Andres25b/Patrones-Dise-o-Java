package PatronFabrica;

import PatronFabrica.Implementaciones.ConexionMySQL;
import PatronFabrica.Implementaciones.ConexionOracle;
import PatronFabrica.Implementaciones.ConexionPostgreSQL;
import PatronFabrica.Implementaciones.ConexionVacia;
import PatronFabrica.Interfaz.IConexion;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		}

		return new ConexionVacia();
	}

}
