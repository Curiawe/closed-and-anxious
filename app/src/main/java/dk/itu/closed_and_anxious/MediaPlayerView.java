package dk.itu.closed_and_anxious;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

public class MediaPlayerView extends ViewModel {
    private static MutableLiveData<Mediaplayer> player;
   
    private MediaPlayerView() {
        super();
        player = new MutableLiveData<>();
        player.setValue(new MediaPlayer());
    }

    public static void setMeditation(String MEDI_REF) {
        // if there already is a player
        // we have to release and 'nullify' it
        if (player != null) {
            player.getValue().release();
            player.setValue(null);
        }

        // next, we use the key from the key from the Meditation
        // to determine which file from the raw-folder should be played.
        switch (MEDI_REF) {
            case "example":
                player.setValue(R.raw.mindful-breathing);
                break;
        
            default:
                
                break;
        }
    }
}
