package com.example.nenenenenene;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View view){
        LinearLayout linearLayout = this.findViewById(R.id.lala1);
        Button btn = new Button(this);
        btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        btn.setText("button_" + ++counter);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                char[] text = ((Button) v).getText().toString().toCharArray();
                if(text[0] == '-'){

                }
                else{
                    ((Button) v).setText(text.toString() + "-");
                }
            }
        });
        linearLayout.addView(btn);
        setContentView(linearLayout);
    }
}