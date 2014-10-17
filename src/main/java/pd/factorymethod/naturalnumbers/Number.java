package pd.factorymethod.naturalnumbers;

public abstract class Number {
	private int value;
	
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
	
	public abstract String getTextValue();
}
