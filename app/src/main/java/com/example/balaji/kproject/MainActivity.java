package com.example.balaji.kproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
Button display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(Button) findViewById(R.id.button);

        display.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, DisplayData.class);

                Bundle a = new Bundle();


                EditText editText = (EditText) findViewById(R.id.editText6);
                String message = editText.getText().toString();
                EditText editText1 = (EditText) findViewById(R.id.editText7);
                String message1 = editText1.getText().toString();
                EditText editText2 = (EditText) findViewById(R.id.editText8);
                String message2 = editText2.getText().toString();
                EditText editText3 = (EditText) findViewById(R.id.editText9);
                String message3 = editText3.getText().toString();
                a.putString("Name", message);
                a.putString("DOB", message1);
                a.putString("Year", message2);
                a.putString("Phone", message3);

                intent.putExtras(a);
                startActivity(intent);
            }
        });


}
    }