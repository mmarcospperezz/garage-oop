package org.ies.vehicles.components;

import org.ies.vehicles.models.Vehicule;
import org.ies.vehicles.models.VehiculeType;

import java.util.Scanner;

public class VehiculeReader {
    private final Scanner scanner;

    public VehiculeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicule read() {
        System.out.println("Introduce los datos del vehiculo");
        int option;
        do {
            System.out.println("Elige el tipo de vehiculo:");
            System.out.println("1.Coche");
            System.out.println("2.Moto");
            System.out.println("3.Camion");
            option = scanner.nextInt();
            scanner.nextLine();
        }
        while (option != 1 && option!= 2 && option!= 3);

        VehiculeType vehiculeType;
        if (option == 1){
            vehiculeType = VehiculeType.Car;
        } else if (option == 2) {
            vehiculeType = VehiculeType.Motorbike;
        } else {
            vehiculeType = VehiculeType.Truck;
        }

        System.out.println("Velocidad maxima");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color");
        String color = scanner.nextLine();

        System.out.println("Matricula");
        String plate = scanner.nextLine();
        scanner.nextLine();

        return new Vehicule(
                vehiculeType,
                maxSpeed,
                color,
                plate
        );
    }
}

