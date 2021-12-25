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

import com.example.wedone.databinding.ActivityRegisterBinding;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class register extends AppCompatActivity implements View.OnClickListener{

    private EditText email, pass;
    private Button buttonsubmit;
    private TextView banner;

    private FirebaseAuth mAuth;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_register);


        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        pass =  (EditText) findViewById(R.id.editTextNumberPassword2);
        banner = (TextView) findViewById(R.id.textView);
        buttonsubmit = (Button) findViewById(R.id.button2);
        buttonsubmit.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();
    }


    public void Opencategory(View view) {
        startActivity(new Intent(register.this,category.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView:
                startActivity(new Intent(register.this,login_activity.class));
                break;
            case R.id.button2:
                buttonsubmit();
                break;
        }

    }

    private void buttonsubmit(){
        String editTextTextEmailAddress2 = email.getText().toString().trim();
        String editTextNumberPassword2 = pass.getText().toString().trim();

        if(editTextTextEmailAddress2.isEmpty()){
            email.setError("Email is Required");
            email.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(editTextTextEmailAddress2).matches()) {
            email.setError("Please provide valid Email");
            email.requestFocus();
            return;
        }
        if(editTextNumberPassword2.isEmpty()){
            pass.setError("Password is Required");
            pass.requestFocus();
            return;
        }

        if (editTextNumberPassword2.length() < 6){
            pass.setError("password length should be minimum 6 characters!");
            pass.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(editTextTextEmailAddress2,editTextNumberPassword2)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                       if(task.isSuccessful()){
                           User user = new User(editTextTextEmailAddress2);
                           FirebaseDatabase.getInstance().getReference("Users")
                                   .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                   .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                               @Override
                               public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(register.this, "User has been registered successfully!", Toast.LENGTH_LONG).show();
                                   }
                                else{
                                    Toast.makeText(register.this, "Failed to register...Try Again!", Toast.LENGTH_LONG).show();
                                }

                               }
                           });
                      }

                    }
                });
    }


    public void Openlogin_activity(View view) {
        startActivity(new Intent(register.this, login_activity.class));
    }
}
