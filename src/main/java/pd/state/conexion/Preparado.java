package pd.state.conexion;

public class Preparado extends Estado{

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());
		
	}

	@Override
	public void abrir(Conexion conexion) {
		
		
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void enviar(String msg,Link link, Conexion conexion) {
		link.enviar(msg);
		conexion.setEstado(new Esperando());
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
	}

	@Override
	public String toString() {
		return "PREPARADO";
	}

}
