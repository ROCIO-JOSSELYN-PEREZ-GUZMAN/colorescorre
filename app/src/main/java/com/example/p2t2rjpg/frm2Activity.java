package com.example.p2t2rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class frm2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        b1=findViewById(R.id.button5);
        b1.setOnClickListener(this);
        e1=findViewById(R.id.editText);
    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
        this.finish();
    }
    public void bGuardar(View view) {
        if(e1.getText().equals(null)){
            Toast to1=Toast.makeText(getApplicationContext(), "campo vacio", Toast.LENGTH_SHORT);
            to1.show();
        }else{
            frm4Activity.agregar( e1.getText().toString());
            Toast to1=Toast.makeText(getApplicationContext(), e1.getText().toString(), Toast.LENGTH_SHORT);
            to1.show();
            e1.setText("");
        }



    }
    public void bMostrar(View view) {
        Intent inte=new Intent(this,frm3Activity.class);
        startActivity(inte);
        this.finish();
    }
}
