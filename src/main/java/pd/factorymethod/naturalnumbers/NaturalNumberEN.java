package pd.factorymethod.naturalnumbers;

public class NaturalNumberEN extends Number{

	private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};
	
	public NaturalNumberEN(int number) {
		super(number);
	}

	@Override
	public String obtenerTextValue(int value) {
		return NaturalNumberEN.textValue[value];
	}

	

}
