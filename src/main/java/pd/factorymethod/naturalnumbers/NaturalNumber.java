package pd.factorymethod.naturalnumbers;

public class NaturalNumber {
	private Number number;
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber(int value){
		this.number = creator.createNaturalNumber(value);
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator creator){
		this.creator  = creator;
	}
}
