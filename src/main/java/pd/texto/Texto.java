package pd.texto;

public class Texto extends Composite{

	@Override
	protected String addFinalDibujar() {
		return "---o---\n";
	}

	@Override
	protected String mensajeAssert() {
		return "Error a�adiendo componente en texto";
	}

	@Override
	protected void lanzarAddNoComposite(Componente componente) {
		throw new UnsupportedOperationException("No se pueden a�adir caracteres a un texto");
		
	}

	@Override
	protected void lanzarAddComposite(Componente componente) {
		this.getComponentes().add(componente);
		
	}

	
}
