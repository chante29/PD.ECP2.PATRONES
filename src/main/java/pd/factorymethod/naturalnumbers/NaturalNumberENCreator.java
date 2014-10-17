package pd.factorymethod.naturalnumbers;

public class NaturalNumberENCreator extends NaturalNumberCreator{

	@Override
	public Number createNaturalNumber(int value) {
		return new NaturalNumberEN(value);
	}

}
