package pd.command.calculadora;

public abstract class ComandoMementableAbstract extends ComandoAbstract{

	private CalculadoraMementable Calculadora;
	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public ComandoMementableAbstract(CalculadoraMementable calculadora) {
		super(calculadora);
		this.Calculadora = calculadora;
		gestorMementos = new GestorMementos<MementoCalculadora>();
	}
	
	

}
