package com.daivers.submission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailAct extends AppCompatActivity {

    ImageView imageView;
    TextView name, detail;

    String clubName, clubDetail;
    int imageClub;

    private List<Klub> list = new ArrayList<>();

    public static String EXTRA_CLUB = "clubName";
    public static String EXTRA_DETAIL = "clubDetail";
    public static String EXTRA_IMAGE = "clubImage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        imageView = findViewById(R.id.photo_klub);
        name = findViewById(R.id.title_club);
        detail = findViewById(R.id.desc_club);

        String nama = getIntent().getExtras().getString("nama");
        Log.d("tag", "debug:nama " + nama);

        name.setText(getIntent().getStringExtra("nama"));
        detail.setText(getIntent().getStringExtra("detail"));
        imageView.setImageResource(getIntent().getIntExtra("photo", 0));
        list = getIntent().getParcelableArrayListExtra("clubList");
    }


    public boolean Navigation() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
