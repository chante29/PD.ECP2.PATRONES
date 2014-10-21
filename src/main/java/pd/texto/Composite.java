package pd.texto;

import java.util.ArrayList;

public abstract class Composite extends Componente{
	private ArrayList<Componente> componentes;
	
	public Composite(){
		componentes = new ArrayList<Componente>();
	}
	
	public ArrayList<Componente> getComponentes(){
		return componentes;
	}
	
	@Override
	public boolean isComposite() {
		return true;
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
	
	public void delete(Componente componente){
		componentes.remove(componente);
	}
	
	@Override
	public void add(Componente componente) {
		if(componente.isComposite()){
			 lanzarAddComposite(componente);
		}else if(!componente.isComposite()){
			lanzarAddNoComposite(componente);
		}else{
			assert false : mensajeAssert();
		}
		
	}

	protected abstract String mensajeAssert();

	protected abstract void lanzarAddNoComposite(Componente componente);

	protected abstract void lanzarAddComposite(Componente componente);
}
