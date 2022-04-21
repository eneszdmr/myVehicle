package com.example.myvehicle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CardView cardView_KM,cardView_yakit,cardView_bakim,cardView_sigorta,cardView_ceza,cardView_vergi;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------Tanımlamalar----------------
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        ImageSlider image_slider = findViewById(R.id.image_slider);
        cardView_KM = findViewById(R.id.cardView_KM);
        cardView_yakit = findViewById(R.id.cardView_yakit);
        cardView_bakim = findViewById(R.id.cardView_bakim);
        cardView_sigorta = findViewById(R.id.cardView_sigorta);
        cardView_ceza = findViewById(R.id.cardView_ceza);
        cardView_vergi = findViewById(R.id.cardView_vergi);


        //---------------------Tool Bar----------------------

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" ");


        //------------------------Navigation Drawer-------------------
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigaton_drawer_open, R.string.navigaton_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //-----------------Değişkenler------------------------------

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.m1, "başlık var", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.m5, ScaleTypes.FIT));
        image_slider.setImageList(slideModels, ScaleTypes.FIT);


        cardView_KM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "şuanki Kilometreniz", Toast.LENGTH_SHORT).show();
            }
        });
        cardView_bakim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                               Toast.makeText(MainActivity.this, "Bakım zamanı yaklaştı", Toast.LENGTH_LONG).show();
            }
        });
    }
}