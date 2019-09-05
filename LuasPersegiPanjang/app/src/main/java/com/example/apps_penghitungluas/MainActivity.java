package com.example.apps_penghitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    EditText mEditHeight;
    EditText mEditWidth;
    TextView mTextResult;
    Button mButtonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditHeight = (EditText)findViewById(R.id.editHeight);
        mEditWidth = (EditText)findViewById(R.id.editWidth);
        mTextResult = (TextView)findViewById(R.id.textResult);
        mButtonCount = (Button)findViewById(R.id.buttonCount);

        mButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    public void calculate(){
        Double value1 = Double.parseDouble(mEditHeight.getText().toString());
        Double value2 = Double.parseDouble(mEditWidth.getText().toString());
        Double resultvalue = value1*value2;
        mTextResult.setText(resultvalue.toString());
    }
}
