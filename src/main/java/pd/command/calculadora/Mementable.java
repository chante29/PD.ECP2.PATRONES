package pd.command.calculadora;

public interface Mementable<T> {
	public T createMemento();
	public void restoreMemento(T memento);
}
