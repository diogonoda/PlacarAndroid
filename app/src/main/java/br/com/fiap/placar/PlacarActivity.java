package br.com.fiap.placar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacarActivity extends AppCompatActivity {
    private TextView tvTimeCasa;
    private TextView tvVisitante;
    private TextView tvPlacarCasa;
    private TextView tvPlacarVisitante;

    private int golCasa = 0, golVisitante = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvVisitante = (TextView) findViewById(R.id.tvVisitante);
        tvPlacarCasa = (TextView) findViewById(R.id.tvPlacarCasa);
        tvPlacarVisitante = (TextView) findViewById(R.id.tvPlacarVisitante);

        if (getIntent() != null) {
            tvTimeCasa.setText(getIntent().getStringExtra("timeCasa"));
            tvVisitante.setText(getIntent().getStringExtra("visitante"));
        }

        if(savedInstanceState != null) {
            golCasa = savedInstanceState.getInt("golCasa");
            golVisitante = savedInstanceState.getInt("golVisitante");
        }

        tvPlacarCasa.setText(String.valueOf(golCasa));
        tvPlacarVisitante.setText(String.valueOf(golVisitante));
    }

    public void golCasa(View view){
        golCasa++;
        tvPlacarCasa.setText(String.valueOf(golCasa));
    }

    public void golVisitante(View view){
        golVisitante++;
        tvPlacarVisitante.setText(String.valueOf(golVisitante));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("golCasa", golCasa);
        outState.putInt("golVisitante", golVisitante);
    }
}
