package com.maulana.hari1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private RadioButton rbYa, rbTidak;
    private Button bLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi view dari xml
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        rbYa = (RadioButton) findViewById(R.id.rb_ya);
        rbTidak = (RadioButton) findViewById(R.id.rb_tidak);
        bLogin = (Button) findViewById(R.id.b_login);

        // Ketika button login di klik
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                boolean remeberMe = true;
                if(rbYa.isChecked()){
                    remeberMe = true;
                }else if(rbTidak.isChecked()){
                    remeberMe = false;
                }

                Intent pindahHalaman = new Intent(MainActivity.this, HomeActivity.class);
                pindahHalaman.putExtra("username", username);
                pindahHalaman.putExtra("password", password);
                pindahHalaman.putExtra("rememberme", remeberMe);
                startActivity(pindahHalaman);
            }
        });
    }
}