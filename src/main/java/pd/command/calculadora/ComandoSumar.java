package pd.command.calculadora;

public class ComandoSumar extends ComandoConNumeroAbstract{

	public ComandoSumar(Calculadora calculadora) {
		super(calculadora);
	}


	@Override
	public String name() {
		return "Sumar";
	}


	@Override
	public void ejecutar(int valor) {
		this.getCalculadora().sumar(valor);
		
	}

}
