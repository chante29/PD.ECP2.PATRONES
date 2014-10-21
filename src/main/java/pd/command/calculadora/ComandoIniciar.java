package pd.command.calculadora;

public class ComandoIniciar extends ComandoAbstract {

	public ComandoIniciar(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		this.getCalculadora().iniciar();
		
	}

	@Override
	public String name() {
		return "Iniciar";
	}

}
