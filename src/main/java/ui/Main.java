package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Path ruta = Path.of("src", "main", "resources", "tours.txt");
        GestorDatos gestor = new GestorDatos();
        TourService servicio = new TourService();

        try {
            ArrayList<Tour> tours =
                    gestor.cargarTours(ruta);

            System.out.println("----- LISTA DE TOURS -----");

            for (Tour tour : tours) {
                System.out.println(tour);
            }

            System.out.println("\n----- TOURS MAYORES A 25000 -----");

            ArrayList<Tour> toursCaros = servicio.filtrarPorPrecio(tours, 25000);

            for (Tour tour : toursCaros) {
                System.out.println(tour);
            }

            System.out.println("\n----- BUSQUEDA POR DESTINO -----");

            servicio.buscarPorDestino(tours, "Puerto Varas");

        } catch (IOException e) {

            System.out.println("Error al cargar archivo: " + e.getMessage());
        }
    }
}