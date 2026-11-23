package model;

public class Guia {

    private String nombre;
    private String especialidad;

    public Guia() {
        this.nombre = "Sin nombre";
        this.especialidad = "General";
    }

    public Guia(String nombre, String especialidad) {
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre del guía obligatorio");
        }
        this.nombre = nombre.trim();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("Especialidad obligatoria");
        }
        this.especialidad = especialidad.trim();
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}