package PatronSigleton;

public class Conexion {

	// DECLARACIÓN
	private static Conexion instancia;
	
	// PARA EVITAR INSTANCIA MEDIANTE OPERADOR "new"
	private Conexion() {
		
	}
	
	// PARA OBTENER LA INSTANCIA UNICAMENTE POR ESTE METODO
	// NOTESE LA PALABRE RESERVADA "static" HACE POSIBLE EL ACCESO MEDIANTE CLASE.METODO
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}
	
	// METODO DE PRUEBA
	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	
	// METODO DE PRUEBA
	public void desconectar() {
		System.out.println("Me desconecté de la BD");
	}
	
}
