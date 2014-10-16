package pd.state.conexion;

public abstract class Estado {

	public abstract void cerrar(Conexion conexion);
	
	public abstract void abrir(Conexion conexion);
	
	public abstract void recibir(int respuesta, Conexion conexion);
	
	public abstract void enviar(String msg, Conexion conexion);

	public abstract void iniciar(Conexion conexion);
	
	public abstract void parar(Conexion conexion);
	
	public abstract String toString();
}
