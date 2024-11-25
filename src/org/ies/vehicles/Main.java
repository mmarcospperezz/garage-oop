package org.ies.vehicles;

import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehiculeReader;
import org.ies.vehicles.models.Garage;
import org.ies.vehicles.models.Vehicule;
import org.ies.vehicles.models.VehiculeType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehiculeReader vehicleReader = new VehiculeReader(scanner);
        GarageReader garageReader= new GarageReader(scanner, vehicleReader);


        Garage garage =  garageReader.read();


        System.out.println(garage);

    }
}
