package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Planet model represents a large mass, planet or planetoid in the Star Wars Universe, at the time of 0 ABY.
 */
public class Planet {
    public String name;
    public String diameter;
    public String gravity;
    public String population;
    public String climate;
    public String terrain;
    public String created;
    public String edited;
    public String url;

    public String rotationPeriod;

    public String orbitalPeriod;

    public String surfaceWater;

    public ArrayList<String> residentsUrls;

    public ArrayList<String> filmsUrls;
}
