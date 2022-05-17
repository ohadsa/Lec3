package Lec3_continue.models;


import java.util.ArrayList;
import java.util.List;

public class MediaList {

    private List<Media> results = new ArrayList<Media>();


    public List<Media> getResults() {
        return results;
    }

    public MediaList setResults(List<Media> results) {
        this.results = results;
        return this;
    }
}
