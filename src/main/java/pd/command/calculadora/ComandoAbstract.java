package pd.command.calculadora;

public abstract class ComandoAbstract implements Comando{

	private Calculadora calc;
	
	public ComandoAbstract(Calculadora calculadora){
		this.calc = calculadora;
	}
	
	public Calculadora getCalculadora(){
		return this.calc;
	}

}
