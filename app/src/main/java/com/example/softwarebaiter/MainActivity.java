package com.example.softwarebaiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view){
        Intent intent = new Intent(this,StartActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(this, "Hell Yeah Brother", Toast.LENGTH_SHORT).show();
    }
}
