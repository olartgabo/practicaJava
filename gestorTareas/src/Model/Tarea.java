package Model;

public abstract class Tarea {
    protected int id;
    protected String descripcion;
    protected boolean completada;

    public Tarea(int id, String descripcion, boolean completada){
        this.id=id;
        this.descripcion=descripcion;
        this.completada=completada;
    }
    
    public int getID(){
        return id;
    }
    public String getDesc(){
        return descripcion;
    }
    public boolean getState(){
        return completada;
    }
}
