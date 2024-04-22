package com.example.labtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

class shape{
    public String name ;

    public shape(String name){
        this.name = name ;
    }


}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}