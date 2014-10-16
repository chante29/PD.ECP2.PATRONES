package pd.composite.expression;

public class Restar extends Operacion{

	public Restar(Expresion expr1, Expresion expr2) {
		super(expr1, expr2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operar() {
		return this.getExpresion1().operar() - this.getExpresion2().operar();
	}

	@Override
	public String toString() {
		return "(" + this.getExpresion1().toString() + "-" + this.getExpresion2().toString() + ")";
	}

}
