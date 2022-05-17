package Lec3;

import Lec3.models.MediaList;
import Lec3.models.MediaManager;
import Lec3.models.Media;
import Lec3.networking.*;

public class Main {
    public static void main(String[] args) {

        MediaManager mManager = new MediaManager(ServiceHandler.getInstance());

        // req for popular movies
        mManager.getMovies(Util.MOVIES_POPULAR_CODE  , (data, exception) -> {
            if(data != null) {
                for (Media m : data.getResults()) {
                    System.out.println(m.toString());
                }
            }
            else{
                System.out.println(exception.getMessage());
            }
        });
    }
}
