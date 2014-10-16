package pd.state.conexion;

public class Cerrado extends Estado{
	@Override
	public void cerrar(Conexion conexion) {
		
		
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
		
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public String toString() {
		return "CERRADO";
	}

	@Override
	public void enviar(String msg, Link link, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

}
