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
    private Button btnMainActivityAceptar, btnMainActivityCancelar;
    private EditText edtMaintActivityNombre;
    private TextView txtMainActivityAlgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.findViews();
        
    }
    
    private void findViews(){
        /*R.id. llama a el boton del view, tener en cuenta la funcion onCreate. */
        btnMainActivityAceptar = findViewById(R.id.btn_sumar);
        
        btnMainActivityCancelar = findViewById(R.id.btn_restar);

        btnMainActivityAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            /*Toast "create new toast" te pone todas las variables */
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Esto es un aviso", Toast.LENGTH_SHORT).show();
            }
        });
        
        btnMainActivityCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}