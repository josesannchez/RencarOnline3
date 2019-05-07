package sanchezartega.facci.rencaronline.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import sanchezartega.facci.rencaronline.R;

public class Registro extends AppCompatActivity {
Button registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        registro = (Button) findViewById(R.id.btnregistro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se genera la navegabilidad entre la actividad principal y la actividad de login
                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
            }
        });

    }
}
