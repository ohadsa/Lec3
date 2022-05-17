package Example;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class TMDB_Serv implements Imovie{
    private OkHttpClient client;
    private final Moshi moshi = new Moshi.Builder().build();
    private final JsonAdapter<MoviesManager> gistJsonAdapter = moshi.adapter(MoviesManager.class);
    private Request request ;

    public TMDB_Serv(String url){
        client = new OkHttpClient();
        request = new Request.Builder()
                .url(url)
                .build();
    }


    public void getData() throws IOException {

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        }
    }

    @Override
    public List<Movie> getAllMovies() throws IOException {
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            MoviesManager movies = gistJsonAdapter.fromJson(response.body().source());
            return movies.getAllMovies();
        }

    }
}

