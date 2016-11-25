package com.example.remereka.szakkor9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cuteButton = (Button) findViewById(R.id.cuteButton);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final EditText edit =  (EditText) findViewById(R.id.editText);

        cuteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edit.getText().toString();
                Toast.makeText(MainActivity.this, "Hey Toast", Toast.LENGTH_SHORT).show();

                textView.setText(text);
            }

        });

    }
}
