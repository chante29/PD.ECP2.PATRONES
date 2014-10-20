package pd.texto;

public class Caracter extends Componente{

	private char intrinseco;
	
	public Caracter(char caracter){
		intrinseco = Character.toLowerCase(caracter);
	}
	
	public char getIntrinseco(){
		return intrinseco;
	}
	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public String dibujar(boolean enMayusculas) {
		String caracter = String.valueOf(intrinseco);
		if(enMayusculas){
			caracter = caracter.toUpperCase();
		}
		return caracter;
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
		
	}

}
