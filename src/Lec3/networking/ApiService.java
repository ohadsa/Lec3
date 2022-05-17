package Lec3.networking;

import Lec3.models.MediaList;

public interface ApiService {

    void getMovies(int reqCode , ApiResult<MediaList, Exception> callback );
}

