package pd.command.calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{

	
	public CalculadoraMementable(){
		super();
	}	
	
	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setTotal(memento.getMemento());
		
	}



}
