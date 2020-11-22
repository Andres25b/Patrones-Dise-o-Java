package PatronSigleton;

public class Main {
	public static void main(String[] args) {
		
		// INSTANCIA POR CONSTRUCTOR PROHIBIDO POR SER "private"
		// CONEXION C = NEW CONEXION();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
		
	}
}
