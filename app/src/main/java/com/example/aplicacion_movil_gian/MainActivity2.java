package com.example.aplicacion_movil_gian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/*import android.widget.Toast;
*/

public class MainActivity2 extends AppCompatActivity {

    private Button btnMainActivity_2_Convertir, btnMainActivity_2_Reiniciar;
    private RadioButton RBMainActivity_2_Dolar , RBMainActivity_2_Euro, RBMainActivity_2_Real;
    private EditText ETMainActivity_2_IngresoDinero;
    private TextView TVMainActivity_2_Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnMainActivity_2_Convertir    = findViewById(R.id.btnMainActivity_2_Convertir);
        btnMainActivity_2_Reiniciar    = findViewById(R.id.btnMainActivity_2_Reiniciar);
        RBMainActivity_2_Dolar         = findViewById(R.id.RBMainActivity_2_Dolar);
        RBMainActivity_2_Euro          = findViewById(R.id.RBMainActivity_2_Euro);
        RBMainActivity_2_Real          = findViewById(R.id.RBMainActivity_2_Real);
        ETMainActivity_2_IngresoDinero = findViewById(R.id.ETMainActivity_2_IngresoDinero);
        TVMainActivity_2_Resultado     = findViewById(R.id.TVMainActivity_2_Resultado);

        btnMainActivity_2_Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarControles();
            }
        });

        btnMainActivity_2_Convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    convertirMoneda();

                }
        });

    }

    private void limpiarControles() {

        RBMainActivity_2_Dolar.setChecked(true);
        ETMainActivity_2_IngresoDinero.setText("");
        TVMainActivity_2_Resultado.setText("$$$");

    }

    private void convertirMoneda() {
        String nInt  = ETMainActivity_2_IngresoDinero.getText().toString();
        int monto = Integer.parseInt(nInt);
        int cotizacion = 0;

        if (RBMainActivity_2_Dolar.isChecked()) {
            cotizacion = 121;
        }
        if (RBMainActivity_2_Euro.isChecked()) {
            cotizacion = 128;
        }
        if (RBMainActivity_2_Real.isChecked()) {
            cotizacion = 24;
        }

        TVMainActivity_2_Resultado.setText(String.valueOf(monto * cotizacion));
    }

}