package com.guillaume.comparaison;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    int Defaultcolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Defaultcolor = findViewById(R.id.txtCompare2).getSolidColor();
    }

    public void CompareNumbers(View button)
    {

        EditText txtCompare1 = findViewById(R.id.txtCompare1);
        EditText txtCompare2 = findViewById(R.id.txtCompare2);
        txtCompare1.setBackgroundColor(Color.alpha( Defaultcolor));
        txtCompare2.setBackgroundColor(Color.alpha( Defaultcolor));
        int number1 = Integer.parseInt(txtCompare1.getText().toString());
        int number2 = Integer.parseInt(txtCompare2.getText().toString());
        if (number1 > number2)
        {
            Toast.makeText(this, "Number 1 greater", Toast.LENGTH_LONG).show();
            txtCompare1.setBackgroundColor(Color.rgb(0,255,0));
        }
        else if (number2 > number1)
        {
            Toast.makeText(this, "Number 2 greater", Toast.LENGTH_LONG).show();
            txtCompare2.setBackgroundColor(Color.rgb(0,255,0));
        }
        else
        {
            Toast.makeText(this, "Numbers are equal", Toast.LENGTH_LONG).show();
        }
    }
}
