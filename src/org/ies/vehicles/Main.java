package org.ies.vehicles;

import org.ies.vehicles.models.Garage;
import org.ies.vehicles.models.Vehicule;
import org.ies.vehicles.models.VehiculeType;

public class Main {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule(
                VehiculeType.Car,
                200,
                "Rojo",
                "WERG7890"
        );

        Vehicule vehicule2 = new Vehicule(
                VehiculeType.Truck,
                150,
                "Negro",
                "VERG7890"
        );

        Vehicule vehicule3 = new Vehicule(
                VehiculeType.Motorbike,
                200,
                "Naranja",
                "WERG7890"
        );

        Vehicule[] vehicules = {vehicule, vehicule2, vehicule3};

        Garage garage = new Garage(
                "Wolkswagen",
                "C/Periana,19",
                vehicules

        );
        System.out.println(garage);
    }
}