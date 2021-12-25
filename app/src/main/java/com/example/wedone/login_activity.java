package com.example.wedone;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wedone.databinding.ActivityLoginBinding;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login_activity extends AppCompatActivity implements View.OnClickListener {

    private TextView register;
    private EditText email, pass;
    private Button login;
    private FirebaseAuth mAuth;

    private AppBarConfiguration appBarConfiguration;
    private ActivityLoginBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        pass =  (EditText) findViewById(R.id.editTextNumberPassword);
        login = (Button) findViewById(R.id.button);
        login.setOnClickListener(this);
        register = (TextView) findViewById(R.id.textView5);
        register.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();
    }

//    public void Opencategory(View view) {
//        startActivity(new Intent(login_activity.this,category.class));
//
//           }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView5:
                startActivity(new Intent(login_activity.this,register.class));
                break;
            case R.id.button:
                userLogin();
                break;
        }

    }

    private void userLogin() {
        String editTextTextEmailAddress = email.getText().toString().trim();
        String editTextNumberPassword = pass.getText().toString().trim();

        if(editTextTextEmailAddress.isEmpty()){
            email.setError("Email is Required");
            email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(editTextTextEmailAddress).matches()) {
            email.setError("Please provide valid Email");
            email.requestFocus();
            return;
        }
        if(editTextNumberPassword.isEmpty()){
            pass.setError("Password is Required");
            pass.requestFocus();
            return;
        }

        if (editTextNumberPassword.length() < 6){
            pass.setError("password length should be minimum 6 characters!");
            pass.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(editTextTextEmailAddress,editTextNumberPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
             if(task.isSuccessful()){
                 startActivity(new Intent(login_activity.this,home_page.class));
             }
             else{
                 Toast.makeText(login_activity.this, "Failed to login...Please check your credentials!", Toast.LENGTH_LONG).show();

             }
            }
        });


    }
}
