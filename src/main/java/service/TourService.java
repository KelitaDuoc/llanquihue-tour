package service;

import model.Tour;
import java.util.ArrayList;

public class TourService {

    public ArrayList<Tour> filtrarPorPrecio(ArrayList<Tour> tours, int precioMinimo) {

        ArrayList<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours) {

            if (tour.getPrecio() > precioMinimo) {
                resultado.add(tour);
            }
        }
        return resultado;
    }

    public void buscarPorDestino(ArrayList<Tour> tours, String destinoBuscado) {

        for (Tour tour : tours) {
            if (tour.getDestino().equalsIgnoreCase(destinoBuscado)) {
                System.out.println(tour);
            }
        }
    }
}