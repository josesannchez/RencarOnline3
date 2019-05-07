package sanchezartega.facci.rencaronline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import sanchezartega.facci.rencaronline.clases.PersonajeVo;
import sanchezartega.facci.rencaronline.clases.Utilidades;

public class Main2Activity extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

}
