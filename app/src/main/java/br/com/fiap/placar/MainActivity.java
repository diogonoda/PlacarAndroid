package br.com.fiap.placar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etTimeCasa;
    private EditText etVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTimeCasa = (EditText) findViewById(R.id.etTimeCasa);
        etVisitante = (EditText) findViewById(R.id.etVisitante);
    }

    public void iniciarJogo(View view){
        Intent abrirPlacar = new Intent(this, PlacarActivity.class);

        abrirPlacar.putExtra("timeCasa", etTimeCasa.getText().toString());
        abrirPlacar.putExtra("visitante", etVisitante.getText().toString());
        startActivity(abrirPlacar);
    }
}
