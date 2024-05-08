package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
    private ImageView queenHorseView, horseOneView, horseTwoView, horseThreeView, horseFourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("hobby-horse.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());
        setContentView(R.layout.activity_main);

        queenHorseView = findViewById(R.id.queen_horse);
        horseOneView = findViewById(R.id.horse_one);
        horseTwoView = findViewById(R.id.horse_two);
        horseThreeView = findViewById(R.id.horse_three);
        horseFourView = findViewById(R.id.horse_four);

        String url1 = "https://m.media-amazon.com/images/I/71FQu2QB0eL._SL1060_.jpg";
        String url3 = "https://img.freepik.com/premium-photo/magical-unicorn-full-colors-so-many-details-magic-horse-from-fairy-tale_853115-4659.jpg?w=1380";
        String url2 = "https://i.etsystatic.com/36531035/r/il/6200b0/5667645573/il_1588xN.5667645573_rnsx.jpg";
        String url4 = "https://i.etsystatic.com/36531035/r/il/2c24ab/5667645571/il_1588xN.5667645571_9mfn.jpg";
        String url5 = "https://media.posterlounge.com/img/products/500000/491269/491269_poster.jpg";

        Picasso.get()
                .load(url1)
                .into(queenHorseView);

        Picasso.get()
                .load(url2)
                .into(horseOneView);

        Picasso.get()
                .load(url3)
                .into(horseTwoView);

        Picasso.get()
                .load(url4)
                .into(horseThreeView);

        Picasso.get()
                .load(url5)
                .into(horseFourView);
    }
}
