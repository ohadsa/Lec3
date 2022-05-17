package Lec3.models;

import Lec3.networking.ApiResult;
import Lec3.networking.ApiService;
import Lec3.networking.ServiceHandler;

public class MediaManager {

    private final ApiService service ;


    public MediaManager(ApiService service) {
        this.service = ServiceHandler.getInstance();
    }

    public void getMovies(int reqCode , ApiResult<MediaList, Exception> callback ){
        service.getMovies(reqCode , callback );
    }

}
