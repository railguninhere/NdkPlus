package com.example.ndkplus;

import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private EditText f_Fir;
    private EditText f_Sec;
    private Button DoPlus;
    private TextView f_Sum;
    private native float add(float num1, float num2);

    static {
        System.loadLibrary("main");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText f_Fir = (EditText)findViewById(R.id.f_first);
        EditText f_Sec = (EditText)findViewById(R.id.f_second);
        Button DoPlus = (Button)findViewById(R.id.plus);
        final TextView f_Sum = (TextView)findViewById(R.id.sum);

        DoPlus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plus:
                float f_f =Float.valueOf(f_Fir.getText().toString());
                float f_s = Float.valueOf(f_Sec.getText().toString());
                String sum = String.valueOf(add(f_f, f_s));
                f_Sum.setText("The Answer =" + sum);
        }



    }
}
