package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1, editText2;
    ImageButton plusBtn, minusBtn, mulBtn, divBtn;
    Button clearBtn;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.textEdit1);
        editText2 = findViewById(R.id.textEdit2);

        plusBtn = findViewById(R.id.imgBtnAdd);
        minusBtn = findViewById(R.id.imgBtnSub);
        mulBtn = findViewById(R.id.imgBtnMul);
        divBtn = findViewById(R.id.imgBtnDiv);
        clearBtn = findViewById(R.id.clearBtn);

        output = findViewById(R.id.outputTv);

        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        mulBtn.setOnClickListener(this);
        divBtn.setOnClickListener(this);

        clearBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        double firstNum = Double.parseDouble((editText1.getText().toString()));
        double secondNum = Double.parseDouble((editText2.getText().toString()));

        if (view == plusBtn) {
            output.setText(String.valueOf(firstNum + secondNum));
        } else if (view == minusBtn) {
            output.setText(String.valueOf(firstNum - secondNum));
        } else if (view == mulBtn) {
            output.setText(String.valueOf(firstNum * secondNum));
        } else if (view == divBtn) {
            output.setText(String.valueOf(firstNum / secondNum));
        } else if (view == clearBtn) {
            editText1.setText("");
            editText2.setText("");
            output.setText("No output");
        }
    }
}