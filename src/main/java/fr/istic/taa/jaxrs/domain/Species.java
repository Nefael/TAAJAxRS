package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Species model represents a type of person or character within the Star Wars Universe.
 */
public class Species {
    public String name;
    public String classification;
    public String designation;

    public String averageHeight;

    public String averageLifespan;

    public String eyeColors;

    public String hairColors;

    public String skinColors;

    public String homeWorld;

    public String language;
    public String created;
    public String edited;
    public String url;

    public ArrayList<String> peopleUrls;

    public ArrayList<String> filmsUrls;
}
