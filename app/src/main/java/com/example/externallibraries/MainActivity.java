package com.example.externallibraries;

import static com.squareup.picasso.Picasso.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView picassoView, horseOneView, horseTwoView, horseThreeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSingletonInstance(new Builder(this).build());

        picassoView = findViewById(R.id.imageView);
        horseOneView = findViewById(R.id.horse_one);
        horseTwoView = findViewById(R.id.horse_two);
        horseThreeView = findViewById(R.id.horse_three);

        String url1 = "https://m.media-amazon.com/images/I/71FQu2QB0eL._SL1060_.jpg";
        String url2 = "https://media.posterlounge.com/img/products/500000/491269/491269_poster.jpg";
        String url3 = "https://img.freepik.com/premium-photo/magical-unicorn-full-colors-so-many-details-magic-horse-from-fairy-tale_853115-4659.jpg?w=1380";
        String url4 = "https://i.etsystatic.com/36531035/r/il/2c24ab/5667645571/il_1588xN.5667645571_9mfn.jpg";

        Picasso.get()
                .load(url1)
                .into(picassoView);

        Picasso.get()
                .load(url2)
                .into(horseOneView);

        Picasso.get()
                .load(url3)
                .into(horseTwoView);

        Picasso.get()
                .load(url4)
                .into(horseThreeView);
    }
}
