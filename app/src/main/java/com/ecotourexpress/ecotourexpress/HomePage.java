package com.ecotourexpress.ecotourexpress;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void onButtonClick(View view) {

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.button_scale);
        view.startAnimation(anim);

        int id = view.getId();

        if (id == R.id.btnUsers) {
            Intent intentUsers = new Intent(this, UsersActivity.class);
            startActivity(intentUsers);
        } else if (id == R.id.btnClients) {
            Intent intentClients = new Intent(this, ClientsActivity.class);
            startActivity(intentClients);
        } else if (id == R.id.btnActivities) {
            Intent intentActivities = new Intent(this, ActivitiesActivity.class);
            startActivity(intentActivities);
        } else if (id == R.id.btnRoutes) {
            Intent intentRoutes = new Intent(this, RoutesActivity.class);
            startActivity(intentRoutes);
        } else if (id == R.id.btnProducts) {
            Intent intentProducts = new Intent(this, ProductsActivity.class);
            startActivity(intentProducts);
        }
    }

}
