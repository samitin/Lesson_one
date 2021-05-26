package ru.samitin.lesson_one;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Task2Activity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        Button button = findViewById(R.id.task2_button);
        EditText nik = findViewById(R.id.nik);
        EditText name = findViewById(R.id.name);
        EditText phone = findViewById(R.id.phone);
        EditText age = findViewById(R.id.age);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),
                        getTextEditText(nik, name, phone, age, email, password),
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    private String getTextEditText(EditText... editTexts) {
        String text = "";
        for (EditText et : editTexts) {
            if (et == null || et.getText().toString().equals(""))
                return "Поле " + et.getHint().toString() + " не заполненно!";
            text += et.getHint().toString() + ": " + et.getText().toString() + "\n";
        }
        return text;
    }
}