package com.example.aplicacion_movil_gian;

import static com.example.aplicacion_movil_gian.R.layout.activity_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Menu extends AppCompatActivity {

    private Button btn_activity_1, btn_activity_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.findViews();

    }

    private void findViews(){
         btn_activity_1 = findViewById(R.id.btn_activity_1);
         btn_activity_2 = findViewById(R.id.btn_activity_2);

        btn_activity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btn_activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
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