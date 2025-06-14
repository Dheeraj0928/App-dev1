package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edtweight, edtHeightFt,edtHeightIn;
        TextView txtResult;


        edtweight= findViewById(R.id.edtweight);
        edtHeightFt=findViewById(R.id.edtheightFt);
        edtHeightIn=findViewById(R.id.edtheightIn);
        txtResult=findViewById(R.id.txtResult);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int wt= Integer.parseInt(edtweight.getText().toString());
              int hf=Integer.parseInt(edtHeightFt.getText().toString());
              int hi= Integer.parseInt(edtHeightIn.getText().toString());

              int totalin= hf*12+hi;
              double totalcm= totalin*2.53;
              double totalm= totalcm/100;

              double bmi= wt/(totalm*totalm);
               if (bmi>25){
                   txtResult.setText("you are over weight");

               }
               else if(bmi<18){
                   txtResult.setText("you are under weight");

                } else{
                   txtResult.setText("you are Healthy");
                   
               }


            }
        });





        }
    }