package com.cursoandroid.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    Usuario usuario = new Usuario("Lucas", "lucasandre@gmail.com");


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Passar dados

                intent.putExtra("nome", "Jamilton");
                intent.putExtra("idade", 30);
                intent.putExtra("objeto", usuario);
                startActivity(intent);

            }
        });

    }


}
