package com.example.aufgabe2_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","function onCreate was started!");

        Button button = findViewById(R.id.ButtonOnFirstPage);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("MainActivity", "Button was pushed!");
            }
        });
        EditText editText = findViewById(R.id.EditText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                Log.d("MainActivity", "Text is on the change!");

            }

            @Override
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                Log.d("MainActivity", "Text is changed!");

            }

            @Override
            public void afterTextChanged(Editable text) {
                Log.d("MainActivity", "Text was changed!");

            }
        });
    }


}