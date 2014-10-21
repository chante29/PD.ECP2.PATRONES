package pd.texto;

public class Parrafo extends Composite{


	@Override
	protected String addFinalDibujar() {
		
		return "\n";
	}


	@Override
	protected String mensajeAssert() {
		return "Error a�adiendo componente en un parrafo";
	}

	@Override
	protected void lanzarAddNoComposite(Componente componente) {
		this.getComponentes().add(componente);
		
	}

	@Override
	protected void lanzarAddComposite(Componente componente) {
		throw new UnsupportedOperationException("No se pueden a�adir compuestos a un parrafo");
		
	}



}
