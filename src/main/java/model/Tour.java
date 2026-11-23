package model;

public class Tour {

    private String nombre;
    private String destino;
    private int precio;
    private Guia guia;

    public Tour(){
        this.nombre = "Sin nombre";
        this.destino = "Sin destino";
        this.precio = 1;
        this.guia = new Guia();
    }

    public Tour(String nombre, String destino, int precio, Guia guia) {
        setNombre(nombre);
        setDestino(destino);
        setPrecio(precio);
        setGuia(guia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del tour es obligatorio");
        }
        this.nombre = nombre.trim();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {

        if(destino == null || destino.isBlank()){
            throw new IllegalArgumentException("El destino es obligatorio");
        }
        this.destino = destino.trim();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {

        if(precio <= 0){
            throw new IllegalArgumentException("Precio del tour debe ser mayor a 0");
        }
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {

        if(guia == null){
            throw new IllegalArgumentException("Debe existir un guía");
        }
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", guia=" + guia +
                '}';
    }
}