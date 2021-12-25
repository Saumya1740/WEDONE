package com.example.wedone;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;

import com.example.wedone.databinding.ActivityWedonelogoOnclickBinding;

public class wedonelogo_onclick extends AppCompatActivity {



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_wedonelogo_onclick);
    }


    public void Opencontact_us(View view) {
        startActivity(new Intent(wedonelogo_onclick.this, contact_us.class));

    }

    public void Opencategory(View view) {
        startActivity(new Intent(wedonelogo_onclick.this, category.class));

    }

    public void Openfood(View view) {
        startActivity(new Intent(wedonelogo_onclick.this, food.class));

    }

    public void Openattirepage(View view) {
        startActivity(new Intent(wedonelogo_onclick.this, attirepage.class));
    }

    public void Openprofile(View view) {
        startActivity(new Intent(wedonelogo_onclick.this, profile.class));

    }
}