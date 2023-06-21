package com.jetbreed.moviereview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Attributes or Variables or Fields

    int name;



    EditText movie_name,year, duration,
            write_review, starring, director;

    RatingBar ratingBar;

    Button btnSave;

    String str_movie_name, str_write_review, str_starring,
            str_director;

    String int_year;

    String int_duration;

    Float rating;

    TextView view_movie_name,view_year, view_duration,
    view_write_review, view_starring, view_director,
    view_rating;


    public void setName(String nameeto)
    {
        this.name = Integer.parseInt(nameeto);
//        return name;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        saves the state of your resources (res)
        super.onCreate(savedInstanceState);

//        renders the saved resources
        setContentView(R.layout.activity_main);

        movie_name = findViewById(R.id.movie_name);
        year = findViewById(R.id.year);
        duration = findViewById(R.id.duration);
        write_review = findViewById(R.id.write_review);
        starring = findViewById(R.id.starring);
        director = findViewById(R.id.director);
        ratingBar = findViewById(R.id.ratingBar);
        btnSave = findViewById(R.id.btnSave);

        view_movie_name = findViewById(R.id.view_movie_name);
        view_year = findViewById(R.id.view_year);
        view_duration = findViewById(R.id.view_duration);
        view_write_review = findViewById(R.id.view_write_review);
        view_starring = findViewById(R.id.view_starring);
        view_director = findViewById(R.id.view_director);
        view_rating = findViewById(R.id.view_rating);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                //the text you typed into the EditText Component
                //of your design e.g the movie name "The Of War!"
                str_movie_name = movie_name.getText().toString();
                int_year = year.getText().toString();
                int_duration = duration.getText().toString();
                str_write_review = write_review.getText().toString();
                str_starring = starring.getText().toString();
                str_director = director.getText().toString();
                rating = ratingBar.getRating();

                if( str_movie_name.equalsIgnoreCase("")
                        || int_year.equalsIgnoreCase("")
                        || int_duration.equalsIgnoreCase("")
                        || str_write_review.equalsIgnoreCase("")
                        || str_starring.equalsIgnoreCase("")
                        || str_director.equalsIgnoreCase("")
                )
                {
                    Toast.makeText(MainActivity.this,
                            "Input Required",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,
                            "Data Saved Successful",
                            Toast.LENGTH_SHORT).show();

                    view_movie_name.setText(str_movie_name);
                    view_year.setText(int_year);
                    view_duration.setText(int_duration);
                    view_write_review.setText(str_write_review);
                    view_starring.setText(str_starring);
                    view_director.setText(str_director);
                    view_rating.setText(rating.toString());

                }
                Toast.makeText(MainActivity.this,
                        "Movie Data Saved",
                        Toast.LENGTH_LONG).show();

//                    movie_name.setText("");
//                    year.setText("");
//                    duration.setText("");
//                    write_review.setText("");
//                    starring.setText("");
//                    director.setText("");
//                    ratingBar.setRating(0);

                }
                catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this,
                            ex.getMessage(),
                            Toast.LENGTH_SHORT).show();
//
//                    movie_name.setText("");
//                    year.setText("");
//                    duration.setText("");
//                    write_review.setText("");
//                    starring.setText("");
//                    director.setText("");
//                    ratingBar.setRating(0);
                }
            }
        });
    }
}