package pd.composite.expression;

public abstract class Operacion extends Expresion{

	private Expresion expresion1;
	private Expresion expresion2;
	
	public Operacion(Expresion expr1, Expresion expr2){
		super();
		this.expresion1 = expr1;
		this.expresion2 = expr2;
	}
	
	public Expresion getExpresion1(){
		return expresion1;
	}
	
	public Expresion getExpresion2(){
		return expresion2;
	}
	

}
