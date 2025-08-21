package Model;

public class Feature extends Tarea {
    private String dev;
    public Feature(int id, String descripcion, boolean completada, String dev){
        super(id, descripcion, completada);
        this.dev = dev;
    }
    public String getDeveloperAsignado() {
        return dev;
    }
    
}
