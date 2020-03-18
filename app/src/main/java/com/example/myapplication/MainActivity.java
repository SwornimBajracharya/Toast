package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.TextBox);
        //This is a test text comment
    }

    public void showToast(View view){
        count = 0;
        Toast toast = Toast.makeText(this, R.string.ToastMessage, Toast.LENGTH_SHORT);
        mShowCount.setText("Hello World!");
        toast.show();
    }

    public void countUp(View view){
        count++;
        mShowCount.setText(Integer.toString(count));
    }
}
