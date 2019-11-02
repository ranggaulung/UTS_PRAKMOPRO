package com.android.recyclerview.uts.prakmobpro;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChangeLanguageActivity extends AppCompatActivity {

    private Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
        tombol = findViewById(R.id.btnChangeLanguage);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "MAAF KAK BELUM SELESAI KEBURU NGANTUK :((((( ", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
