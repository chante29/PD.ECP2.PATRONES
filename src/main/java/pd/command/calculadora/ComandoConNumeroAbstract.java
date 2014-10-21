package pd.command.calculadora;

import upm.jbb.IO;

public abstract class ComandoConNumeroAbstract extends ComandoAbstract{

	public ComandoConNumeroAbstract(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		ejecutar(IO.in.readInt("Introduce el numero con el que operar"));
	}
	
	public abstract void ejecutar(int valor);

}
