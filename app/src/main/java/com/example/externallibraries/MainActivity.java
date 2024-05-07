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
        //String url = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/95f34c22-cbd5-486e-b58f-d9a55ff3c38f/df055xl-8b11f93f-9e60-4d39-a09d-682e76918699.jpg/v1/fill/w_900,h_900,q_75,strp/magic_horse_by_polychromika_df055xl-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9OTAwIiwicGF0aCI6IlwvZlwvOTVmMzRjMjItY2JkNS00ODZlLWI1OGYtZDlhNTVmZjNjMzhmXC9kZjA1NXhsLThiMTFmOTNmLTllNjAtNGQzOS1hMDlkLTY4MmU3NjkxODY5OS5qcGciLCJ3aWR0aCI6Ijw9OTAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.youUtEBzGV3vXWdtTuqVgLKoXzSNQwqLNvKEbjZfZQQ";

        Picasso.get()
                .load(url)
                .into(picassoView);

    }
}
