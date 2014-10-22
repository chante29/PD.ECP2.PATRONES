package pd.command.calculadora;

import upm.jbb.IO;

public class MainMementoCalculadora {
	 private GestorComandos gestor;
	 
	 private GestorMementos<MementoCalculadora> gm;

	    public MainMementoCalculadora() {
	        CalculadoraMementable calc = new CalculadoraMementable();
	        gm = new GestorMementos<MementoCalculadora>();
	        this.gestor = new GestorComandos();
	        this.gestor.add(new ComandoSumar(calc));
	        this.gestor.add(new ComandoRestar(calc));
	        this.gestor.add(new ComandoIniciar(calc));
	        this.gestor.add(new ComandoImprimir(calc));
	        this.gestor.add(new ComandoGuardar(calc, gm));
	        this.gestor.add(new ComandoDeshacer(calc, gm));
	    }

	    public void ejecutar() {
	        String key = (String) IO.in.select(this.gestor.keys());
	        this.gestor.execute(key);
	    }

	    public static void main(String[] args) {
	        IO.in.addController(new MainMementoCalculadora());
	    }

}
