package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Vehicle model represents a single transport craft that does not have hyperdrive capability.
 */
public class Vehicle {
    public String name;
    public String model;

    public String vehicleClass;

    public String manufacturer;

    public String costInCredits;

    public String length;
    public String crew;
    public String passengers;

    public String maxAtmospheringSpeed;

    public String cargoCapacity;

    public String consumables;
    public String created;
    public String edited;
    public String url;

    public ArrayList<String> pilotsUrls;

    public ArrayList<String> filmsUrls;
}
