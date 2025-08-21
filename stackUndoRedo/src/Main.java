import Model.EditorTexto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n--- Editor de Texto ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Ver contenido actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Escribe el nuevo texto: ");
                    String nuevoTexto = scanner.nextLine();
                    editor.escribir(nuevoTexto);
                    break;
                case "2":
                    editor.undo();
                    break;
                case "3":
                    editor.redo();
                    break;
                case "4":
                    System.out.println("Contenido actual: " + editor.getContenidoActual());
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (!opcion.equals("0"));

        scanner.close();
    }
}
