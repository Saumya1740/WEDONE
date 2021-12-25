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

import com.example.wedone.databinding.ActivityVendorPageBinding;

public class VendorPage extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_vendor_page);
    }
    public void Openfood(View view) {
        startActivity(new Intent(VendorPage.this, food.class));

    }

    public void Opendecor(View view) {
        startActivity(new Intent(VendorPage.this, decor.class));

    }

    public void Openphotograpghy(View view) {
        startActivity(new Intent(VendorPage.this, photograpghy.class));

    }

    public void Openbeautyservice(View view) {
        startActivity(new Intent(VendorPage.this, beautyservice.class));

    }

}