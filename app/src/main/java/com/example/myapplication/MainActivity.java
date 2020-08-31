package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  public Button button;

    @Override
  public   void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

 static int count=0;
    @Override
    public void onClick(View v) {
       count++;
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setText(count+"");
        button.setText(count+"");

    }
}
