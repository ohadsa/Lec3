package Lec3_continue.networking;

import Lec3_continue.models.MediaList;

public interface ApiService {

    void getMovies(int reqCode , ApiResult<MediaList, Exception> callback );
}

