package ru.samitin.lesson_one;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Task1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.button);
        EditText editText=findViewById(R.id.editText);
        Switch aSwitch=findViewById(R.id.switch1);
        CheckBox checkBox=findViewById(R.id.checkBox);
        ToggleButton toggleButton=findViewById(R.id.toggleButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText(editText.getText().toString());
                if (aSwitch.isChecked()&&checkBox.isChecked())
                    textView.setTypeface(null,Typeface.BOLD_ITALIC);
                else if(aSwitch.isChecked()) {
                    Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.BOLD);
                    textView.setTypeface(boldTypeface);
                }
                else if (checkBox.isChecked())
                    textView.setTypeface(null,Typeface.ITALIC);
                else
                    textView.setTypeface(null,Typeface.NORMAL);

                if(toggleButton.isChecked())
                    textView.setTextColor(Color.RED);
                else
                    textView.setTextColor(Color.GREEN);
            }
        });
    }
}