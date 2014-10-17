package pd.factorymethod.naturalnumbers;


public class NaturalNumber {
	private Number number;
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber(){
		this.number = creator.createNaturalNumber(number.getValue());
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator creator){
		this.creator  = creator;
	}
	
	public Number getNumber(){
		return number;
	}
	
}
