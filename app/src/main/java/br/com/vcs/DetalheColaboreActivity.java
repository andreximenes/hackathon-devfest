package br.com.vcs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetalheColaboreActivity extends AppCompatActivity {

    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_colabore);

        btnFinalizar = (Button) findViewById(R.id.btn_finalizar);

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalheColaboreActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(DetalheColaboreActivity.this, ColaboreActivity.class);
        startActivity(intent);
        finish();
    }
}