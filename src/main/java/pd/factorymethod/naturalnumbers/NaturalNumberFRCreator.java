package pd.factorymethod.naturalnumbers;

public class NaturalNumberFRCreator extends NaturalNumberCreator{

	@Override
	public Number createNaturalNumber(int value) {
		return new NaturalNumberFR(value);
	}

}
