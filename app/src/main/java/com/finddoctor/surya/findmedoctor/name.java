package com.finddoctor.surya.findmedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class name extends AppCompatActivity {

    public void help(View V)
    {
    EditText textbox2 = (EditText) findViewById(R.id.dd);
    String s = textbox2.toString();
    String text1 = textbox2.getText().toString().trim().toLowerCase();

    if (text1.compareTo("surya sen") == 0) {
        Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();
        TextView mytv1 = (TextView) findViewById(R.id.say);
        mytv1.setText("Medica Hospital \n Mobile no. : +9188779900");
    }
else if(text1.compareTo("surya sen") == 0) {
        Toast.makeText(getApplicationContext(), "You Can See Now", Toast.LENGTH_LONG).show();
        TextView mytv1 = (TextView) findViewById(R.id.say);
        mytv1.setText("Medica Hospital \n Mobile no. : +9188779900");
    }
        else
    {
        Toast.makeText(getApplicationContext(), "No Results Found", Toast.LENGTH_LONG).show();
        TextView mytv1 = (TextView) findViewById(R.id.say);
        mytv1.setText("No Results Found");
    }
    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
    }
}
