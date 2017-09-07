package com.finddoctor.surya.findmedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    public void name(View v)
    {
        try {

            Intent i = new Intent(MainActivity.this, name.class);

            startActivity(i);
            Toast.makeText(getApplicationContext(), "Search By Name", Toast.LENGTH_LONG).show();

        }
        catch (SecurityException se)
        {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
        }

    }

    public void symp(View v)
    {
        Intent i = new Intent(MainActivity.this, symptt.class);

        startActivity(i);

            Toast.makeText(getApplicationContext(), "Search By Symptoms", Toast.LENGTH_LONG).show();
        }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
