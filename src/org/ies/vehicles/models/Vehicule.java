package org.ies.vehicles.models;

import java.util.Objects;

public class Vehicule {
    private VehiculeType vehiculeType;
    private int maxSpeed;
    private String color;
    private String plate;

    public Vehicule(VehiculeType vehiculeType, int maxSpeed, String color, String plate) {
        this.vehiculeType = vehiculeType;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.plate = plate;
    }

    public VehiculeType getVehiculeType() {
        return vehiculeType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public void setVehiculeType(VehiculeType vehiculeType) {
        this.vehiculeType = vehiculeType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return maxSpeed == vehicule.maxSpeed && vehiculeType == vehicule.vehiculeType && Objects.equals(color, vehicule.color) && Objects.equals(plate, vehicule.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculeType, maxSpeed, color, plate);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vehiculeType=" + vehiculeType +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}