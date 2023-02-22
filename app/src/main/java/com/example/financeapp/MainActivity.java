package com.example.financeapp;

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


    public void openActivity(View v){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, EMI.class);
//        name = findViewById(R.id.name);
//        String nameText = name.getText().toString();
//        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }
}