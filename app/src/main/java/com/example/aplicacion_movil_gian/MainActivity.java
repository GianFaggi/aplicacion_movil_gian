package com.example.aplicacion_movil_gian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /* btnMainActivity es el nombre de la variable, puede diferir del view, por buena practica no deberia */
    private Button btnMainActivity_sumar, btnMainActivity_restar, btnMainActivity_zoompositivo, btnMainActivity_zoomnegativo, btnMainActivity_ocultar, btnMainActivity_reiniciar;
    private EditText ETMainActivity_IngresoCuenta;
    private TextView txtMainActivityAlgo;
    private int N = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.findViews();
        
    }
    
    private void findViews(){
        /*R.id. llama a el boton del view, tener en cuenta la funcion onCreate. */

        btnMainActivity_sumar        = findViewById(R.id.btnMainActivity_sumar);
        btnMainActivity_restar       = findViewById(R.id.btnMainActivity_restar);
        btnMainActivity_zoompositivo = findViewById(R.id.btnMainActivity_zoompositivo);
        btnMainActivity_zoomnegativo = findViewById(R.id.btnMainActivity_zoomnegativo);
        btnMainActivity_ocultar      = findViewById(R.id.btnMainActivity_ocultar);
        btnMainActivity_reiniciar    = findViewById(R.id.btnMainActivity_reiniciar);
        ETMainActivity_IngresoCuenta = findViewById(R.id.ETMainActivity_IngresoCuenta);

        btnMainActivity_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            /*Toast "create new toast" te pone todas las variables */
            public void onClick(View view) {
                Suma();
            }
        });

        btnMainActivity_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resta();
            }
        });

        btnMainActivity_zoompositivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

        btnMainActivity_zoomnegativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

        btnMainActivity_ocultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETMainActivity_IngresoCuenta.setVisibility(view.INVISIBLE);
            }
        });

        btnMainActivity_reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiarControles();

            }
        });
    }


    private void limpiarControles() {

        ETMainActivity_IngresoCuenta.setText("");
        N = 0;

    }

    private void Suma() {
        String nInt  = ETMainActivity_IngresoCuenta.getText().toString();
        int suma = Integer.parseInt(nInt);
        N = suma + N;

        ETMainActivity_IngresoCuenta.setText(String.valueOf(N));
    }

    private void Resta() {
        String nInt  = ETMainActivity_IngresoCuenta.getText().toString();
        int resta = Integer.parseInt(nInt);
        N = resta - N;

        ETMainActivity_IngresoCuenta.setText(String.valueOf(N));
    }

}