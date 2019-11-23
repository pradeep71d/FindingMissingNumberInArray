package com.example.missingnumberinarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] a = {10,9,3,5,4,7,8,1,2};
        int indexes = 10;
        int values = 0;

        for (int i = 0; i < a.length; i++) {
            indexes = indexes+i+1;
            values = values+a[i];
        }

        int result = indexes - values;

        System.out.println("Missing number is: "+result);
    }
}


