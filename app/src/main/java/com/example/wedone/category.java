package com.example.wedone;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wedone.databinding.ActivityCategoryBinding;

import java.util.Locale;

public class category extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCategoryBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_category);
    }

    public void Openattirepage(View view) {
        startActivity(new Intent(category.this,attirepage.class));
    }

    public void Openattire_category(View view) {
        startActivity(new Intent(category.this,attire_category.class));

    }

    public void Opentradional_category(View view) {
        startActivity(new Intent(category.this,tradional_category.class));

    }

    public void Openjewellery(View view) {
        startActivity(new Intent(category.this,jewellery.class));

    }

    public void Openringspage(View view) {
        startActivity(new Intent(category.this,rings_page.class));

    }

    public void Openvendorpage(View view) {
        startActivity(new Intent(category.this,VendorPage.class));

    }

    public void Opengifts(View view) {
        startActivity(new Intent(category.this,gifts.class));

    }

    public void Openwedonelogo_onclick(View view) {
        startActivity(new Intent(category.this,wedonelogo_onclick.class));


    }

    public void OpenNavigation(View view) {
        startActivity(new Intent(category.this,navigationdrawer.class));

    }
}