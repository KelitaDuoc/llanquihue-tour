package data;
import model.Tour;
import model.Guia;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorDatos {
    public ArrayList<Tour> cargarTours(Path rutaArchivo) throws IOException {
        ArrayList <Tour> listaTour = new ArrayList();

         try (BufferedReader lector = Files.newBufferedReader(rutaArchivo, StandardCharsets.UTF_8)){
            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                if (linea.isBlank()) {
                continue;
                }
                String [] campos = linea.split(";", -1);
                if (campos.length !=3) {
                    System.out.println("Se omite linea " + numeroLinea + " porque no tiene 3 campos");
                    continue;
                }
                try {
                    String nombre = campos[0].trim();
                    String destino = campos[1].trim();
                    int precio = Integer.parseInt(campos[2].trim());

                    Guia guia = new Guia("Juan Pérez", "Turismo regional");
                    Tour tour = new Tour(nombre, destino, precio, guia);

                    listaTour.add(tour);
                } catch (IllegalArgumentException e) {

                    System.err.println("Se omite linea " + numeroLinea + ": " + e.getMessage());
                }
            }
         }
        return listaTour;
    }
}
