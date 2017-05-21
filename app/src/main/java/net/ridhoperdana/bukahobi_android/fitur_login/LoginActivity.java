package net.ridhoperdana.bukahobi_android.fitur_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.ridhoperdana.bukahobi_android.halaman_home.HomeActivity;
import net.ridhoperdana.bukahobi_android.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        Button tombol_masuk_aplikasi = (Button)findViewById(R.id.tombolMasukAplikasi);
        tombol_masuk_aplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_masuk_aplikasi = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent_masuk_aplikasi);
            }
        });
    }
}
