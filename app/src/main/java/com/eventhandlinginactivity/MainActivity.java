package com.eventhandlinginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int counter = 0;
    TextView counterTextView;
    Button incrementBtn, decrementBtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListener();
    }

    private void initViews() {
        counterTextView = findViewById(R.id.counter);
        counterTextView.setText(Integer.toString(counter));
        incrementBtn = findViewById(R.id.increment);
        decrementBtn = findViewById(R.id.decrement);
        resetBtn = findViewById(R.id.reset);
    }

    private void setListener() {
        incrementBtn.setOnClickListener(this);
        decrementBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.increment:
                counterTextView.setText(Integer.toString(++counter));
                break;
            case R.id.decrement:
                counterTextView.setText(Integer.toString(--counter));
                break;
            case R.id.reset:
                counter = 0;
                counterTextView.setText(Integer.toString(counter));
                break;
            default: {
            }
        }
    }
}
