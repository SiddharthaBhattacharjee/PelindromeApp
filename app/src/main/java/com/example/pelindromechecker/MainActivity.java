package com.example.pelindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView op;
    Button b;
    EditText in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op = findViewById(R.id.output);
        b = findViewById(R.id.button);
        in = findViewById(R.id.input);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = in.getText().toString();
                int l = s.length();
                String s1 = "";
                for(int i=l-1;i>=0;i--){
                    s1 = new StringBuilder().append(s1).append(s.charAt(i)).toString();
                }
                if(s.equals(s1)){
                    op.setText("The Entered Word is a Pelindrome");
                }
                else{
                    op.setText("The Entered Word is not a Pelindrome");
                }
            }
        });
    }
}