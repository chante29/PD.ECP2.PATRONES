package pd.composite.expression;

public class Sumar extends Operacion{

	public Sumar(Expresion expr1, Expresion expr2) {
		super(expr1, expr2);
	}

	@Override
	public int operar() {
		return this.getExpresion1().operar() + this.getExpresion2().operar();
	}

	@Override
	public String toString() {
		
		return "(" + this.getExpresion1().toString() + "+" + this.getExpresion2().toString() + ")";
	}

}
