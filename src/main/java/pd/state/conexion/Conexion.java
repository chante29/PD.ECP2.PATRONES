package pd.state.conexion;


public class Conexion {
    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado();
    }
    
    protected void setEstado(Estado estado){
    	this.estado = estado;
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        estado.abrir(this);
    }

    public void cerrar() {
       estado.cerrar(this);
    }

    public void parar() {
       estado.parar(this);
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void enviar(String msg) {
        estado.enviar(msg, this);
    }

    public void recibir(int respuesta) {
        estado.recibir(respuesta, this);
    }
}
