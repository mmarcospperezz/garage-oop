package org.ies.vehicles.components;

import org.ies.vehicles.models.Garage;
import org.ies.vehicles.models.Vehicule;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehiculeReader vehiculeReader;

    public GarageReader(Scanner scanner, VehiculeReader vehiculeReader) {
        this.scanner = scanner;
        this.vehiculeReader = vehiculeReader;
    }

    public Garage read(){
        System.out.println("Introduce los datos del garaje");
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Direccion");
        String address = scanner.nextLine();

        System.out.println("¿Cuantos vehiculos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Vehicule[] vehicules = new Vehicule[size];
        for (int  i = 0; i < vehicules.length; i++) {
            vehicules[i] = vehiculeReader.read();
        }
        Vehicule vehicule1 = vehiculeReader.read();
        Vehicule vehicule2 = vehiculeReader.read();
        Vehicule vehicule3 = vehiculeReader.read();

        Vehicule[] vehicule = {vehicule1, vehicule2, vehicule3};

        return new Garage(
                name,
                address,
                vehicules
        );


    }
}
