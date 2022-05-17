package Example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String url = "https://api.themoviedb.org/3/discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1" ;
        TMDB_Serv server = new TMDB_Serv(url);
        MoviesManager mManager = new MoviesManager();
        try {
            mManager.addMoviesFromServer(server);
            mManager.printAllMovies();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
