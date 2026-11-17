package model;

public class Tour {

    private String nombre;
    private String destino;
    private int precio;

    public Tour (){
        this.nombre = "Sin nombre";
        this.destino = "Sin destino";
        this.precio = 0;
    }


    public Tour(String nombre, String destino, int precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del tour es obligatorio");
        }
        this.nombre = nombre.trim();
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("El destino del tour es obligatorio");
        }
        this.destino = destino.trim();
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Precio del tour debe ser mayor a 0");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                '}';
    }
}

