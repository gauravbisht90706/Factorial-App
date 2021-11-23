package com.example.application_first;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       val number = findViewById<EditText>(R.id.input);
       val result = findViewById<TextView>(R.id.answer);
       val button = findViewById<Button>(R.id.button);

        button.setOnClickListener(){
            result.setText("Factorial  = " +fact(number.text.toString().toInt()).toString());
        }}
         fun fact(num:Int):Int{
            if(num <= 1){
                return 1;
            }
            else{
                return num * fact(num-1);
            }

    }


    }





