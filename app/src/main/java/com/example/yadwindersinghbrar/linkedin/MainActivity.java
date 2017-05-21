package com.example.yadwindersinghbrar.linkedin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void network(View view) {
        Intent intent = new Intent(this,MyNetwork.class);
        startActivity(intent);
    }
    public void messages(View view) {
        Intent intent = new Intent(this,Messages.class);
        startActivity(intent);
    }
    public void Jobb(View view) {
        Intent intent = new Intent(this,Jobs.class);
        startActivity(intent);
    }


}
