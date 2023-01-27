package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Weight, height;
    TextView resulttext;
    String calculation, BMIresult;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weight = findViewById(R.id.weight);
        height = findViewById(R.id.Height);
        resulttext = findViewById(R.id.result);
        calculate = findViewById(R.id.calculateid);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String S1 = Weight.getText().toString();
                String S2 = height.getText().toString();

                float weightValue = Float.parseFloat(S1);
                float HeightValue = Float.parseFloat(S2) / 100;

                float bmi = weightValue / (HeightValue * HeightValue);

                if (bmi < 16) {
                    BMIresult = "Several under Weight";
                } else if (bmi < 18.5) {
                    BMIresult = "Under Weight";
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    BMIresult = "Normal Weight";
                } else if (bmi >= 25 && bmi <= 29.9) {
                    BMIresult = "Over Weight";
                } else {
                    BMIresult = "Over Weight";
                }

                calculation = "Result: \n\n" + bmi + "\n" + BMIresult;

                resulttext.setText(calculation);

            }

        });

    }


}