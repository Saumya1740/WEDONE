package com.example.wedone;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wedone.databinding.ActivityBeautyserviceBinding;

public class beautyservice extends AppCompatActivity implements View.OnClickListener {
    TextView textView4, textView5, textView6,textView7,textView8,textView9;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_beautyservice);

        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);

        TextView textView4 =  (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(this);

        TextView textView5 =  (TextView) findViewById(R.id.textView5);
        textView4.setOnClickListener(this);

        TextView textView6 =  (TextView) findViewById(R.id.textView6);
        textView4.setOnClickListener(this);

        TextView textView7 =  (TextView) findViewById(R.id.textView7);
        textView4.setOnClickListener(this);

        TextView textView8 =  (TextView) findViewById(R.id.textView8);
        textView4.setOnClickListener(this);

        TextView textView9 =  (TextView) findViewById(R.id.textView9);
        textView4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(beautyservice.this);
        builder.setMessage("Add to cart?")
                .setPositiveButton("Yes", null)
                .setNegativeButton("No", null);
        AlertDialog alert = builder.create();
        alert.show();
    }

};