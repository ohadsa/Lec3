package Lec3.networking;

import Lec3.models.MediaList;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ApiManager implements ApiService {
    private final OkHttpClient client = new OkHttpClient();
    private final Moshi moshi = new Moshi.Builder().build();
    private final JsonAdapter<MediaList> gistJsonAdapter = moshi.adapter(MediaList.class);
    private MediaList media;

    @Override
    public void getMovies(int reqCode , ApiResult<MediaList, Exception> callback ) {
        Request request = new Request.Builder()
                .url(Util.urls[reqCode])
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
               callback.onResult(null, e);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                    Headers responseHeaders = response.headers();
                    for (int i = 0, size = responseHeaders.size(); i < size; i++) {
                        System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                    }

                    if (responseBody != null) {
                        media = gistJsonAdapter.fromJson(responseBody.source());
                        callback.onResult(media, null);
                    }

                    else {
                        callback.onResult(null, new ApiEmptyBodyException());
                    }
                }
            }
        });
    }
}
