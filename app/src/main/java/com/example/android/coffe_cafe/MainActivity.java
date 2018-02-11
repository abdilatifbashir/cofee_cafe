package com.example.android.coffe_cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int quatity=2;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(2);
        displayPrice(2 * 5);
        Log.d(TAG, "submitOrder:");


    }

    private void display(int number) {
        TextView numberOfCups = (TextView) findViewById(R.id.number_of_cups);
        numberOfCups.setText("" + number);
        Log.d(TAG, "submitOrder2:");
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void decrment(View view) {
        quatity=quatity-1;
        display(quatity);

    }
public void increment(View view){
        quatity=quatity+1;
        display(quatity);

}

}