package com.example.wedone;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.WindowManager;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wedone.databinding.ActivityMensattireBinding;

public class mensattire extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_mensattire);
    }

    public void Opencategory(View view) {
        startActivity(new Intent(mensattire.this, category.class));
    }

    public void Openkurtapyjama(View view) {
        startActivity(new Intent(mensattire.this, kurtapyjama.class));

    }

    public void Opensherwani(View view) {
        startActivity(new Intent(mensattire.this, sherwani.class));

    }

    public void Openkurtajacket(View view) {
        startActivity(new Intent(mensattire.this, kurtajacket.class));

    }

    public void Openweddingsuits(View view) {
        startActivity(new Intent(mensattire.this,weddingsuits.class));

    }

    public void Openattire_category(View view) {
        startActivity(new Intent(mensattire.this,attire_category.class));

    }
}