package com.example.onclicklisteners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        //Finding views by Id's

        TextView tv1=findViewById(R.id.textView1);
        TextView tv2=findViewById(R.id.textView2);
        TextView tv3=findViewById(R.id.textView3);
        tv2.setOnClickListener(this);
        // first way to set OnClickListener

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "First Way", Toast.LENGTH_SHORT).show();
            }
        });
    }


    // Second Way to set OnClickListener
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Second Way", Toast.LENGTH_SHORT).show();
    }

    public void third(View view) {
        Toast.makeText(MainActivity.this, "Third Way", Toast.LENGTH_SHORT).show();
    }
}