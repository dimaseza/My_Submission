package com.daivers.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import java.util.ArrayList;

import static com.daivers.submission.DataKlub.DetailKlub;
import static com.daivers.submission.DataKlub.KlubPhoto;
import static com.daivers.submission.DataKlub.NamaKlub;
import static com.daivers.submission.DataKlub.getListData;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKlub;
    private ArrayList<Klub> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKlub = findViewById(R.id.revi_club);
        rvKlub.setHasFixedSize(true);

        list.addAll(DataKlub.getListData());
        showRecyclerList();


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.iconProfile){
            startActivity(new Intent(MainActivity.this, profileAct.class));
        }
        return true;
    }

    private void showRecyclerList() {
        rvKlub.setLayoutManager(new LinearLayoutManager(this));
        ListKlubAdapter listKlubAdapt = new ListKlubAdapter(list);
        rvKlub.setAdapter(listKlubAdapt);
        listKlubAdapt.setOnItemClickCallback(new ListKlubAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Klub clickClub) {
                String nama = clickClub.getNama();
                String detail = clickClub.getDetail();
                int photo = clickClub.getPhoto();
                Intent intent = new Intent(MainActivity.this, DetailAct.class);
                intent.putExtra("nama", nama);
                intent.putExtra("detail", detail);
                intent.putExtra("photo", photo);
                startActivity(intent);
            }
        });
    }


}
