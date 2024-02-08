package com.sebas.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    boolean result = true;
    String name = "Perez";
    TextView nombreUsuario;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);

        calcularArea(int L1, int L2)
        
        btn1.setOnClickListener(new View.setOnClickListener(){
            @Override
            public void onClick(View View){
                nombreUsuario.setText("Presiona el otro boton");

            }
        } );

        btn2.setOnClickListener(new View.setOnClickListener(){
            @Override
            public void onClick(View View){
                nombreUsuario.setText("Haz precionadp el boton correcto");

            }
        } );


    }

    public double calcularArea(int L1,int L2){
        return L1*L2;
    }
}