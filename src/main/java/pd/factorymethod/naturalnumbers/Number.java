package pd.factorymethod.naturalnumbers;


public abstract class Number {
	private int value;
	private static final int CANTIDAD_NUMEROS = 6;
	public Number(int number){
		this.value = number;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void add(int value){
		this.setValue(this.value + value);
	}
	
	public String getTextValue(){
		if (this.value < Number.CANTIDAD_NUMEROS) {
            return obtenerTextValue(this.value);
        } else {
            return "???";
        }
	}
	
	public abstract String obtenerTextValue(int value);
}
