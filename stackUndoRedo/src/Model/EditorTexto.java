package Model;

import java.util.Stack;

public class EditorTexto {
    private String contenidoActual;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public EditorTexto() {
        this.contenidoActual = "";
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void escribir(String nuevoTexto) {
        undoStack.push(contenidoActual);
        contenidoActual = nuevoTexto;
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(contenidoActual);
            contenidoActual = undoStack.pop();
        } else {
            System.out.println("No hay nada que deshacer.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(contenidoActual);
            contenidoActual = redoStack.pop();
        } else {
            System.out.println("No hay nada que rehacer.");
        }
    }

    public String getContenidoActual() {
        return contenidoActual;
    }
}
