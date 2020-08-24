package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button lbutton;
    private Button rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbutton=findViewById(R.id.button2);
        lbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openLogin();
            }
            public void openLogin(){
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });

        rbutton=findViewById(R.id.button4);
        rbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openRegister();
            }
            public void openRegister(){
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut(); //logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}