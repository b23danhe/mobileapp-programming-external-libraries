package com.example.externallibraries;

import static com.squareup.picasso.Picasso.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView picassoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSingletonInstance(new Builder(this).build());

        picassoView = findViewById(R.id.imageView);

        String url = "https://m.media-amazon.com/images/I/71FQu2QB0eL._SL1060_.jpg";

        Picasso.get()
                .load(url)
                .into(picassoView);
    }
}
