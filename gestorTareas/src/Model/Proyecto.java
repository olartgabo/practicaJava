package Model;
import java.util.ArrayList;
import java.util.List;
public class Proyecto {
    private List<Tarea> tareas;
    public Proyecto(){
        this.tareas=new ArrayList<>();
    }
    public void agregarTarea(Tarea tarea){
        this.tareas.add(tarea);
        //aqui estoy haciendo referencia a la lista 
        //tareas a;adiendo una version de Tarea a la cual le llamo tarea
    }
    public List<Tarea> listaTareas(){
        return tareas;
    }
    /*
     * Implementa 
     * el método obtenerFeaturesPorDeveloper
     * (String nombre) en Proyecto.
     */
    public List<Tarea> obtenerFeaturesPorDeveloper(String nombre){
        List<Tarea> featuresEncontradas = new ArrayList<>();
        for(Tarea tarea:tareas){
            if(tarea instanceof Feature){
            Feature feature = (Feature) tarea;
            if(feature.getDeveloperAsignado().equalsIgnoreCase(nombre)){
                featuresEncontradas.add(feature);
            }
            }
        }
        return featuresEncontradas;
    }
 


}
