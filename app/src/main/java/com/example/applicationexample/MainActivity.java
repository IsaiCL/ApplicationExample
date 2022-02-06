package com.example.applicationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LinearLayout layout1 = findViewById(R.id.layout1);

        TextView titulo = new TextView(this);
        titulo.setGravity(Gravity.CENTER);
        titulo.setText("APP EXAMPLE");
        layout1.addView(titulo);


        Calendar Calendario = Calendar.getInstance();
        int day = Calendario.get(Calendar.DAY_OF_MONTH);

        for (int f = 1; f <= day; f++) {

            Button boton = new Button(this);
            boton.setText("Day " + f);
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button b = (Button) view;
                    Toast.makeText(MainActivity.this, b.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            layout1.addView(boton);
        }

        LinearLayout layout2=new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        layout1.addView(layout2);

        Button boton1=new Button(this);
        boton1.setText("Aceptar");
        layout2.addView(boton1);

        Button boton2=new Button(this);
        boton2.setText("Salir");
        layout2.addView(boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        boton1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,1));
        boton2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,1));
    }
}