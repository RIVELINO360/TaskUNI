package model;

public class Task {
    private int id;
    private String nombre;
    private String curso;
    private boolean completada;

    public Task(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.completada = false;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCurso() { return curso; }
    public boolean isCompletada() { return completada; }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}