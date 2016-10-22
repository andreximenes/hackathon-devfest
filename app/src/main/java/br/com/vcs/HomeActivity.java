package br.com.vcs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnColabore;
    private Button btnColabore2;
    private Button btnMonitore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnColabore = (Button) findViewById(R.id.btn_colabore);
        btnColabore2 = (Button) findViewById(R.id.btn_colabore2);
        btnMonitore = (Button) findViewById(R.id.btn_monitore);

        btnColabore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ColaboreActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnColabore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ColaboreFocoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnMonitore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
