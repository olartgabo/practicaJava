import Model.Bug;
import Model.Feature;
import Model.Proyecto;
import Model.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Proyecto miProyecto = new Proyecto();
        miProyecto.agregarTarea(new Bug(1234, "Ejemplo", false, 10));
        miProyecto.agregarTarea(new Feature(4321, "Sopenco", false, "JuanCarlos"));
        miProyecto.agregarTarea(new Feature(2, "Sopenco", false, "Pedro"));

        System.out.println("De que developer te interesa recibir su lista de tareas?");
        Scanner cin = new Scanner(System.in);
        String developer = cin.next();
        cin.close();
        List<Tarea> tareasDev = miProyecto.obtenerFeaturesPorDeveloper(developer);
        // miProyecto.obtenerFeaturesPorDeveloper("Juan Carlos");

        if (tareasDev.isEmpty()) {
            System.out.println("Buenas noticias! " + developer + " No tiene tareas pendientes");
        } else {
            System.out.println(developer + " tiene las siguientes Tareas asignadas");
            for (Tarea feature : tareasDev) {
                System.out.println("ID: " + feature.getID() +
                        " Descripcion: " + feature.getDesc() +
                        " Completado: " + feature.getState());
            }
        }
    }
}
