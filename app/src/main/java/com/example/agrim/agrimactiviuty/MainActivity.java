package com.example.agrim.agrimactiviuty;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2 = (EditText) findViewById(R.id.editText1);
        editText1 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

    }

    int number1,number2;
    public void getText(){
        String s1 = editText1.getText().toString();
        number1 = Integer.parseInt(s1);
        String s2 = editText2.getText().toString();
        number2 = Integer.parseInt(s2);
    }


    public void add(View view){
        getText();
        int a = number1 + number2;
        Snackbar snackbar = Snackbar.make(view,""+a,Snackbar.LENGTH_LONG );
        snackbar.show();

    }

    public void subtract(View view) {
        getText();
        int s = number1 - number2;

        Snackbar snackbar = Snackbar.make(view, ""+s, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public void multiply(View view){
        getText();
        int m = number1 * number2;
        Snackbar snackbar = Snackbar.make(view,""+m,Snackbar.LENGTH_LONG );
        snackbar.show();
    }

    public void divide(View view){
        getText();
        int d = number1 / number2;
        Snackbar snackbar = Snackbar.make(view,""+d,Snackbar.LENGTH_LONG );
        snackbar.show();
    }


}
