package pd.texto;

public abstract class Componente {

	public abstract boolean isComposite();
	public abstract String dibujar(boolean enMayusculas);
	public abstract void add(Componente componente);
}
