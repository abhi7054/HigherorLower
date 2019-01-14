package com.example.android.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void makeToast(String string)
    {
        TextView text=findViewById(R.id.result);
        text.setText(string);
    }

    public void checkNumber(View view)
    {
        EditText enterednumber= (EditText) findViewById(R.id.numberEntered);
        int guessentered= Integer.parseInt(enterednumber.getText().toString());




        if(guessentered>n)
        {
           makeToast("Lower");
        }
        else if(guessentered<n)
        {
            makeToast("Higher");

        }
        else
        {
           makeToast("Great its correct try another");
            Random number=new Random();
            n=number.nextInt(20)+1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random number=new Random();
         n=number.nextInt(20)+1;
    }
}
