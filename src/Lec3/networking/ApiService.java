package Lec3.networking;

import Lec3.models.MediaList;

public interface ApiService {

    void getData(int reqCode , ApiResult<MediaList, Exception> callback );
}

