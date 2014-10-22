package pd.command.calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMementableAbstract {



	public ComandoDeshacer(CalculadoraMementable calculadora,
			GestorMementos<MementoCalculadora> gm) {
		super(calculadora, gm);
	}

	@Override
	public void execute() {
		String[] puntosGuardados = this.getGestorMementos().keys();
		if(puntosGuardados.length > 0){
			MementoCalculadora memento = this.getGestorMementos().getMemento(String.valueOf(IO.in.select(puntosGuardados, "selecciona punto guardado")));
			this.getCalculadoraMementable().restoreMemento(memento);
		}else{
			IO.out.println("No hay puntos guardados");
		}
		
	}

	@Override
	public String name() {
		
		return "Deshacer";
	}

}
