public class Meditation {
    private String name;
    private String category;
    private String description;
    private String key;
    
    /**
     * A 'data holder' class to store all information related to a Meditation.
     * 
     * @param wName Display name of the Meditation
     * @param wCategory Category for sorting and displaying the "Song"
     * @param wDescription Display description to be printed to the UI
     * @param key Database key, also used for selecting the correct audio file via method 'getFile in the MeditationPlayer class'
     */
    public Meditation(String wName, String wCategory, String wDescription, String key){
        name = wName;
        category = wCategory;
        description = wDescription;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }
    
}
