package org.ies.vehicles.models;
import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String direction;
    private String[] vehicule;

    public Garage(String name, String direction, String[] vehicule) {
        this.name = name;
        this.direction = direction;
        this.vehicule = vehicule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String[] getVehicule() {
        return vehicule;
    }

    public void setVehicule(String[] vehicule) {
        this.vehicule = vehicule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(direction, garage.direction) && Objects.deepEquals(vehicule, garage.vehicule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, Arrays.hashCode(vehicule));
    }
}
