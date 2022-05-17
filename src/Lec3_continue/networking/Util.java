package Lec3_continue.networking;

public class Util {
    private static String KEY = "?api_key=96624ea86553cd7a4caed4ecbdc35ec1";
    private static String BASE = "https://api.themoviedb.org/3/";

    public static String[] urls = {
            BASE + "movie/top_rated" + KEY ,
            BASE + "movie/latest" + KEY ,
            BASE + "discover/movie" + KEY ,
            BASE + "tv/top_rated" + KEY ,
    };
    public static int MOVIES_POPULAR_CODE = 0;
    public static int MOVIES_NEW_CODE = 1;
    public static int MOVIES_GENRES_CODE = 2;
    public static int MOVIES_SERIES_CODE = 3;


}
