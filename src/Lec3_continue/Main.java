package Lec3_continue;

import Lec3_continue.models.MediaList;
import Lec3_continue.models.MediaManager;
import Lec3_continue.models.Media;
import Lec3_continue.networking.*;

public class Main {
    public static void main(String[] args) {

        MediaManager mManager = new MediaManager(ServiceHandler.getInstance());

        // req for popular movies
        mManager.getMovies(Util.MOVIES_POPULAR_CODE  , new ApiResult<MediaList, Exception>() {
            @Override
            public void onResult( MediaList data, Exception exception) {
                if(data != null) {
                    for (Media m : data.getResults()) {
                        System.out.println(m.toString());
                    }
                }
                else{
                    System.out.println(exception.getMessage().toString());
                }
            }
        });
    }
}
