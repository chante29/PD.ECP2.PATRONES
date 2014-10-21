package pd.command.calculadora;

public class ComandoRestar extends ComandoConNumeroAbstract{

	public ComandoRestar(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String name() {
		return "Restar";
	}



	@Override
	public void ejecutar(int valor) {
		this.getCalculadora().restar(valor);
		
	}

}
