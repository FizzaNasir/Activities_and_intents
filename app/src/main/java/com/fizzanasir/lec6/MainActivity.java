package com.fizzanasir.lec6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox CheckBoxDone, CheckBoxPending, CheckBoxRead;
    Button simpleButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBoxPending=findViewById(R.id.checkBoxpending);
        CheckBoxPending.setOnClickListener(this);
        CheckBoxRead.setOnClickListener(this);
        CheckBoxDone.setOnClickListener(this);
        CheckBoxRead=findViewById(R.id.checkBoxread);
        CheckBoxDone=findViewById(R.id.checkBoxdone);
        simpleButton2 =findViewById(R.id.button);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.checkBoxdone:
                if(CheckBoxDone.isChecked())
                {
                    simpleButton2.setText("checkboxdone");
                }
                break;
            case R.id.checkBoxread:
                if(CheckBoxRead.isChecked())
                {
                    simpleButton2.setText("checkboxread");
                }
                break;
            case R.id.checkBoxpending:
                if(CheckBoxPending.isChecked())
                {
                    simpleButton2.setText("checkboxpending");
                }
                break;
        }
    }
}