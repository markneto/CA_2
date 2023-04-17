package com.example.mobileapps1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private RecyclerView movieList;
    private MovieListAdapter movieListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = findViewById(R.id.movie_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        movieList.setLayoutManager(layoutManager);

        fetchMovies();
    }

    private void fetchMovies() {
        OkHttpClient client = new OkHttpClient();
        String url = "https://gist.githubusercontent.com/markneto/39fe50f6f0d2e469b68b02a1f414fc03/raw/b84d1ae6656c9f74becaa54aab3491f7e9bd531f/movie.json";

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                // Trate o erro aqui
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String jsonData = response.body().string();

                    Gson gson = new Gson();
                    Type movieListType = new TypeToken<List<Movie>>(){}.getType();
                    List<Movie> movies = gson.fromJson(jsonData, movieListType);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            movieListAdapter = new MovieListAdapter(MainActivity.this, movies);
                            movieList.setAdapter(movieListAdapter);
                        }
                    });
                } else {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(MainActivity.this, "Its not avaiable.", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }
}
