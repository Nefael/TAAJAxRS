package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Film list model
 */
public class SWModelList<T>{
    public int count;
    public String next;
    public String previous;
    public ArrayList<T> results;

    public boolean hasMore() {
        return (next != null && next.length() != 0);
    }
}
