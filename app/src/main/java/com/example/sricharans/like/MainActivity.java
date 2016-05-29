package com.example.sricharans.like;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int AddOnInt = 0;
    private TextView noview;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        noview = (TextView) findViewById(R.id.textView2);

    }


    public void onClick(View v) {
        if(v==btn1) {
            AddOnInt++;
            noview.setText(Integer.toString(AddOnInt));
        }
        else if(v == btn2){
            AddOnInt = 0;
            noview.setText(Integer.toString(AddOnInt));
        }
    }
}

