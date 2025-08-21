package Model;

public class Bug extends Tarea {
    private int severidad;
    public Bug(int id, String descripcion, boolean completada, int severidad){
        super(id, descripcion, completada);
        this.severidad = severidad;
    }
}
