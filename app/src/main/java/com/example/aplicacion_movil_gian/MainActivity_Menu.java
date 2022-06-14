package com.example.aplicacion_movil_gian;

import static com.example.aplicacion_movil_gian.R.layout.activity_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Menu extends AppCompatActivity {

    private Button btnMenuActivity_1, btnMenuActivity_2, btnMenuActivity_Contactenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.findViews();

    }

    private void findViews(){
        btnMenuActivity_1           = findViewById(R.id.btnMenuActivity_1);
        btnMenuActivity_2           = findViewById(R.id.btnMenuActivity_2);
        btnMenuActivity_Contactenos = findViewById(R.id.btnMenuActivity_Contactenos);

        btnMenuActivity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnMenuActivity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        btnMenuActivity_Contactenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Contactenos.class);
                startActivity(intent);
            }
        });



    }

    /*buscar metodo onclick para enganchar el toast

    public void Vista(View view){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        /* en que clase estamos, a que clase queremos ir

        Intent intent = new Intent(MainActivity_Menu.this, MainActivity.class);
        startActivity(intent);
    }

    */
}