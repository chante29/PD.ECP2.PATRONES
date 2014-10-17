package pd.factorymethod.naturalnumbers;

public class NaturalNumberESCreator extends NaturalNumberCreator{

	@Override
	public Number createNaturalNumber(int value) {
		return new NaturalNumberES(value);
	}

	
}
