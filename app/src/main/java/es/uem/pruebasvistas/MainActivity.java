package es.uem.pruebasvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View view) {
        System.out.println("Hola mundo");
        // TODO: 10/10/2020 MOSTRAR SALUDO en tvText

    }
}