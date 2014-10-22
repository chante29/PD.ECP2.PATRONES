package pd.command.calculadora;

public abstract class ComandoMementableAbstract extends ComandoAbstract{
	
	private CalculadoraMementable calcMem;

	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public ComandoMementableAbstract(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gm) {
		super(calculadora);
		this.calcMem = calculadora;
		gestorMementos = gm;
	}
	
	public CalculadoraMementable getCalculadoraMementable(){
		return calcMem;
	}
	
	
	public GestorMementos<MementoCalculadora> getGestorMementos(){
		return this.gestorMementos;
	}
	
	

}
