package com.example.universityres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        EditText number3 = findViewById(R.id.editTextTextPersonName3);
        EditText number4 = findViewById(R.id.editTextTextPersonName4);
        Button cal = findViewById(R.id.cal);
        Button reset = findViewById(R.id.reset);
        TextView result = findViewById(R.id.rsult);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int o = Integer.parseInt(number3.getText().toString());
                int i = Integer.parseInt(number4.getText().toString());
                int c = a + b + o + i ;
                result.setText(c + "%");
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               number1.getText().clear();
               number2.setText(null);
               number3.setText("");
               number4.setText("");
                result.setText(null);

            }
        });




    }
}