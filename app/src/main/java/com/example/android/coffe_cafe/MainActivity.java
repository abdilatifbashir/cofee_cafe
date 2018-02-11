package com.example.android.coffe_cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void submitOrder(View view){
display(7);
    Log.d(TAG,"submitOrder:");


}

private void display(int number){
    TextView numberOfCups=(TextView) findViewById(R.id.number_of_cups);
    numberOfCups.setText(""+number);
    Log.d(TAG,"submitOrder2:");
}
}
