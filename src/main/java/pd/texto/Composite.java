package pd.texto;

import java.util.ArrayList;

public abstract class Composite extends Componente{
	private ArrayList<Componente> componentes;
	
	public ArrayList<Componente> getComponentes(){
		return componentes;
	}
	
	@Override
	public boolean isComposite() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String dibujar(boolean enMayusculas) {
		String cadenaDibujar ="";
		for(int numComponente = 0; numComponente < this.getComponentes().size(); numComponente++) {
			cadenaDibujar += this.getComponentes().get(numComponente).dibujar(enMayusculas);
		}
		
		return cadenaDibujar + addFinalDibujar();
	}
	
	protected abstract String addFinalDibujar();
}
