package pd.command.calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbstract {

	public ComandoImprimir(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		IO.out.println("El resultado es=" + this.getCalculadora().getTotal());
		
	}

	@Override
	public String name() {
		return "Imprimir";
	}

}
