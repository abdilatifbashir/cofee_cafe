package com.example.android.coffe_cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int quatity=0;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String myMessage= quatity + " cups of coffe ordered successfully";
        display(quatity);
        displayPrice(quatity * 5);
        displayMessage(myMessage);
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
        this.quatity=quatity-1;
        display(quatity);

    }
public void increment(View view){
        this.quatity=quatity+1;
        display(quatity);

}
public void displayMessage(String message){
    TextView amountCoffeTextView=findViewById(R.id.total_amount_count);
    amountCoffeTextView.setText(""+ message);
}

}