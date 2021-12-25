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

import com.example.wedone.databinding.ActivityTradionalCategoryBinding;

public class tradional_category extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_tradional_category);
    }


    public void Openhindu(View view) {
        startActivity(new Intent(tradional_category.this, hindu.class));
    }

    public void Opensikhs(View view) {
        startActivity(new Intent(tradional_category.this, sikhs.class));

    }

    public void Openmuslim(View view) {
        startActivity(new Intent(tradional_category.this, muslim.class));

    }

    public void Openchristians(View view) {
        startActivity(new Intent(tradional_category.this, christians.class));

    }
}