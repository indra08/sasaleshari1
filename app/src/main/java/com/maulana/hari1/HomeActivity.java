package com.maulana.hari1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView tvIsiUsername, tvIsiTersimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Inisialisasi UI
        tvIsiUsername = (TextView) findViewById(R.id.tv_isi_username);
        tvIsiTersimpan = (TextView) findViewById(R.id.tv_isi_tersimpan);

        Bundle isiData = getIntent().getExtras();
        if(isiData != null){

            String username = isiData.getString("username", "");
            boolean rememberMe = isiData.getBoolean("rememberme", false);

            // Versi singkat dari if else, sama saja if (rememberMe) {"Ya"} else {"tidak"}
            String tersimpan = rememberMe ? "Ya" : "Tidak";

            tvIsiUsername.setText(username);
            tvIsiTersimpan.setText(tersimpan);
        }

        // Memanggil datepicker
    }
}