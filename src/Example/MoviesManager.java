package Example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MoviesManager {

    List<Movie> results = new ArrayList<Movie>();

    public void addMoviesFromServer(Imovie server ) throws IOException {
        results.addAll(server.getAllMovies());
    }

    public List<Movie> getAllMovies(){
        return results;
    }



    public void printAllMovies(){
        for( Movie m : results)
            System.out.println(m.toString());
    }

}


