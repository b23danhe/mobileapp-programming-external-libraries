package com.example.externallibraries;

import static com.squareup.picasso.Picasso.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView picassoView, horseOneView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSingletonInstance(new Builder(this).build());

        picassoView = findViewById(R.id.imageView);
        horseOneView = findViewById(R.id.horse_one);

        String url1 = "https://m.media-amazon.com/images/I/71FQu2QB0eL._SL1060_.jpg";
        String url2 = "https://media.posterlounge.com/img/products/500000/491269/491269_poster.jpg";

        Picasso.get()
                .load(url1)
                .into(picassoView);

        Picasso.get()
                .load(url2)
                .into(horseOneView);
    }
}
