package Lec3_continue.networking;

public interface ApiResult<T, E> {
    void onResult(T data, E exception);

}
