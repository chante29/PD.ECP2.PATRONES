package pd.command.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMementableAbstract{

	

	public ComandoGuardar(CalculadoraMementable calculadora,
			GestorMementos<MementoCalculadora> gm) {
		super(calculadora, gm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		this.getGestorMementos().addMemento(IO.in.readString("Introduce nombre de punto de guardado"), this.getCalculadoraMementable().createMemento());
	}

	@Override
	public String name() {
		return "Guardar";
	}

}
