package com.finddoctor.surya.findmedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class symptt extends AppCompatActivity {

    public void itemClicked(View v) {
        //code to check if this checkbox is checked!
        CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12;
        checkBox1 = (CheckBox)findViewById(R.id.checkBox13);// ear i
        checkBox2 = (CheckBox)findViewById(R.id.checkBox14);//ear
        checkBox3 = (CheckBox)findViewById(R.id.checkBox15);//skin 5 bone 6
        checkBox4 = (CheckBox)findViewById(R.id.checkBox16);//heart 7 stomac
        checkBox5 = (CheckBox)findViewById(R.id.checkBox17);//througt general phy 4
        checkBox6 = (CheckBox)findViewById(R.id.checkBox18);//body weight
        checkBox7 = (CheckBox)findViewById(R.id.checkBox19);//body weight gain
        checkBox8 = (CheckBox)findViewById(R.id.checkBox20);//eyes2
        checkBox9 = (CheckBox)findViewById(R.id.checkBox21);//eyes
        checkBox10 = (CheckBox)findViewById(R.id.checkBox22);//skin
        checkBox12 = (CheckBox)findViewById(R.id.checkBox);

        checkBox11 = (CheckBox)findViewById(R.id.checkBox23);// brain 3 // 8 admited

        if(checkBox1.isChecked() && checkBox2.isChecked() || checkBox2.isChecked() || checkBox1.isChecked()) {

            Intent i = new Intent(symptt.this, doc1.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "You Need  A Ear doctor ", Toast.LENGTH_LONG).show();

        }

        else if(checkBox3.isChecked()){

            Intent i = new Intent(symptt.this, doc5.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }

        else if(checkBox4.isChecked()){

            Intent i = new Intent(symptt.this, doc7.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox4.isChecked()){

            Intent i = new Intent(symptt.this, doc2.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox5.isChecked()){

            Intent i = new Intent(symptt.this, doc4.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox6.isChecked()|| checkBox7.isChecked()){

            Intent i = new Intent(symptt.this, doc7.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }

        else if(checkBox8.isChecked()){

            Intent i = new Intent(symptt.this, doc2.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox9.isChecked()){

            Intent i = new Intent(symptt.this, doc2.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }

        else if(checkBox10.isChecked()){

            Intent i = new Intent(symptt.this, doc5.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox11.isChecked()){

            Intent i = new Intent(symptt.this, doc3.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }
        else if(checkBox12.isChecked()){

            Intent i = new Intent(symptt.this, doc9.class);

            startActivity(i);


            Toast.makeText(getApplicationContext(), "Your Results", Toast.LENGTH_LONG).show();

        }



        else
        {
            Toast.makeText(getApplicationContext(), "No Results", Toast.LENGTH_LONG).show();
        }






    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptt);
    }
}
