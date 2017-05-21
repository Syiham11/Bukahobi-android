package net.ridhoperdana.bukahobi_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import net.ridhoperdana.bukahobi_android.halaman_home.HomeActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView menu_home      = (ImageView)findViewById(R.id.menu_home);
        ImageView menu_search    = (ImageView)findViewById(R.id.menu_search);
        ImageView menu_message   = (ImageView)findViewById(R.id.menu_message);
        ImageView menu_profil    = (ImageView)findViewById(R.id.menu_person);

        menu_home.setOnClickListener(tombolMenu);
        menu_search.setOnClickListener(tombolMenu);

    }

    private View.OnClickListener tombolMenu = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.menu_home)
            {
                Intent intent = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent);
            }
            else if(view.getId()==R.id.menu_search)
            {
                Intent intent = new Intent(getApplication(), SearchActivity.class);
                startActivity(intent);
            }
        }
    };
}
