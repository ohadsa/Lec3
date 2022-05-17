package Lec3.networking;

public interface ApiResult<T, E> {
    void onResult(T data, E exception);

}
