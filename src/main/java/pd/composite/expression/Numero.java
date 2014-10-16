package pd.composite.expression;

public class Numero extends Expresion{
	private int numero;
	
	public Numero(int numero){
		this.numero = numero;
	}

	@Override
	public double operar() {
		return numero;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
