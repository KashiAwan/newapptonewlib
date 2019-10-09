package com.example.newapptonewlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a="kashif";
        b = "Rashiq";

        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    public void Kashi(){
        Toast.makeText(this, "This is kashif function", Toast.LENGTH_SHORT).show();
    }
}
