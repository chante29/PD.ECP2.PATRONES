package pd.command.calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{

	private int memento;
	
	public CalculadoraMementable(int memento){
		super();
		this.memento = memento;
	}	
	
	@Override
	public MementoCalculadora createMemento() {
		return null;
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		// TODO Auto-generated method stub
		
	}



}
