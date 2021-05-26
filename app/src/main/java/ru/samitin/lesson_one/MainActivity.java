package ru.samitin.lesson_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button task1,task2,task3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        task1=findViewById(R.id.task1);
        task2=findViewById(R.id.task2);
        task3=findViewById(R.id.task3);

        task1.setOnClickListener(this);
        task2.setOnClickListener(this);
        task3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.task1:
                intent=new Intent(this,Task1Activity.class);
                break;
            case R.id.task2:
                intent=new Intent(this,Task2Activity.class);
                break;
            case R.id.task3:
                intent=new Intent(this,Task3Activity.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
        if(intent!=null)
            startActivity(intent);
    }
}