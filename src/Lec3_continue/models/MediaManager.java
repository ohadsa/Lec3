package Lec3_continue.models;

import Lec3_continue.models.MediaList;
import Lec3_continue.networking.ApiResult;
import Lec3_continue.networking.ApiService;
import Lec3_continue.networking.ServiceHandler;

public class MediaManager {

    private final ApiService service ;


    public MediaManager(ApiService service) {
        this.service = ServiceHandler.getInstance();
    }

    public void getMovies(int reqCode , ApiResult<MediaList, Exception> callback ){
        service.getMovies(reqCode , callback );
    }

}
