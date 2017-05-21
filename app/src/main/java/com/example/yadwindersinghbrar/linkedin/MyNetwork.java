package com.example.yadwindersinghbrar.linkedin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyNetwork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_network);
    }
    public void home(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void messages(View view) {
        Intent intent = new Intent(this,Messages.class);
        startActivity(intent);
    }
}
