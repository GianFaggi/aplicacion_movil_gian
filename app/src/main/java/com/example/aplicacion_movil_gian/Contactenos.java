package com.example.aplicacion_movil_gian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contactenos extends AppCompatActivity {


    private Button btnContactenosActivity_Telefono, btnContactenosActivity_Mail, btnContactenosActivity_Github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactenos);

        this.findViews();
    }

    private void findViews(){

        btnContactenosActivity_Telefono = findViewById(R.id.btnContactenosActivity_Telefono);
        btnContactenosActivity_Mail     = findViewById(R.id.btnContactenosActivity_Mail);
        btnContactenosActivity_Github   = findViewById(R.id.btnContactenosActivity_Github);

        btnContactenosActivity_Telefono.setOnClickListener(new View.OnClickListener() {
            @Override
            /*Toast "create new toast" te pone todas las variables */
            public void onClick(View view) {

                dialPhoneNumber("123456789");

            }
        });

        btnContactenosActivity_Mail.setOnClickListener(new View.OnClickListener() {
            @Override
            /*Toast "create new toast" te pone todas las variables */
            public void onClick(View view) {
                String correo = "gianfaggi@gmail.com";
                String sujeto = "Prueba";

                composeEmail(correo, sujeto);

            }
        });

        btnContactenosActivity_Github.setOnClickListener(new View.OnClickListener() {
            @Override
            /*Toast "create new toast" te pone todas las variables */
            public void onClick(View view) {

            }
        });

    }

    public void composeEmail(String addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}