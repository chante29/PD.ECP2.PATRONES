package pd.factorymethod.naturalnumbers;

public class NaturalNumberES extends Number{

	private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
	public NaturalNumberES(int number) {
		super(number);
	}
	@Override
	public String obtenerTextValue(int value) {
		return NaturalNumberES.textValue[value];
	}

	

}
