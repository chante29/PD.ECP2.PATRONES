package pd.factorymethod.naturalnumbers;

public class NaturalNumberFR extends Number{
	
	private static final String[] textValue = {"zéro", "un", "deux", "trois", "quatre", "cinq"};
	
	public NaturalNumberFR(int number) {
		super(number);
	}

	@Override
	public String obtenerTextValue(int value) {
		return NaturalNumberFR.textValue[value];
	}

}
