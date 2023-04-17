package com.example.mobileapps1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.text.TextUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

public class MovieDetailsActivity extends AppCompatActivity {
    private Movie movie;
    private TextView movieSeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        ImageView movieImage = findViewById(R.id.movie_image);
        TextView movieTitle = findViewById(R.id.movie_title);
        TextView movieGenre = findViewById(R.id.movie_genre);
        TextView movieDescription = findViewById(R.id.movie_description);
        TextView movieActors = findViewById(R.id.movie_actors);
        TextView movieShowtimes = findViewById(R.id.movie_showtimes);
        movieSeats = findViewById(R.id.movie_seats);
        Button buyTicketsButton = findViewById(R.id.buy_tickets_button);

        Gson gson = new Gson();
        movie = gson.fromJson(getIntent().getStringExtra("movieJson"), Movie.class);

        Glide.with(this).load(movie.imageUrl).into(movieImage);
        movieTitle.setText(movie.title);
        movieGenre.setText(movie.genre);
        movieDescription.setText(movie.description);
        movieActors.setText("Actors: " + movie.actors);
        movieShowtimes.setText("Showtimes: " + TextUtils.join(", ", movie.showTime));
        updateSeatsText();

        buyTicketsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (movie.availableSeats > 0) {
                    movie.availableSeats -= 1;
                    updateSeatsText();
                    Toast.makeText(MovieDetailsActivity.this, "Ticket purchased!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MovieDetailsActivity.this, "No seats available.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void updateSeatsText() {
        movieSeats.setText("Available Seats: " + movie.availableSeats);
    }
}



