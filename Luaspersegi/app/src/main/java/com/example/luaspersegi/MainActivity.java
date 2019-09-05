package com.example.luaspersegi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.luaspersegi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private double valueOne;
    private double valueTwo;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(binding.editText1.getText().toString());
                valueTwo = Double.parseDouble(binding.editText2.getText().toString());
                total = valueOne * valueTwo;
                binding.infoTextView.setText(total + "0");
            }
        });
    }
}
