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

import com.example.wedone.databinding.ActivityAttireCategoryBinding;

public class attire_category extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityAttireCategoryBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_attire_category);
    }


    public void Opencoordinatingwesternattires(View view) {
        startActivity(new Intent(attire_category.this,coordinatingwesternattires.class));
    }

    public void Opencoordinatingindianattires(View view) {
        startActivity(new Intent(attire_category.this,coordinatingindianattires.class));

    }

    public void Openmensattire(View view) {
        startActivity(new Intent(attire_category.this,mensattire.class));

    }

    public void Openafterattirepage(View view) {
        startActivity(new Intent(attire_category.this,afterattirepage.class));

    }
}