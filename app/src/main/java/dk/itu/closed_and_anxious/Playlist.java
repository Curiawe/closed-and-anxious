package dk.itu.closed_and_anxious;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private String description;
    private ArrayList<Meditation> meditations;

    /**
     * A Playlist is the Object that holds 
     * @param category
     */
    public Playlist(String category) {

        // make db-Call to table "Playlists" with 
        //category String to get name, description

        // then make db call to table "Meditations" with
        // category String to get array of Meditation items

        // use boilerplate (to be written) to extract Meditation
        // objects from dbResult array and put into meditations

        // should probably be part of the sqlite db class?
    }

    public ArrayList<Meditation> getMeditations() {
        return meditations;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }



}
