package Lec3.networking;

public class Util {
    public static final String KEY = "?api_key=96624ea86553cd7a4caed4ecbdc35ec1";
    public static final String BASE = "https://api.themoviedb.org/3/";

    /*
    "https://api.themoviedb.org/3/movie/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1"
    "https://api.themoviedb.org/3/movie/latest?api_key=96624ea86553cd7a4caed4ecbdc35ec1"
    "https://api.themoviedb.org/3/discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1"
    "https://api.themoviedb.org/3/tv/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1"
     */

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
