package net.ridhoperdana.bukahobi_android.halaman_home;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import net.ridhoperdana.bukahobi_android.R;
import net.ridhoperdana.bukahobi_android.SearchActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_home);
        viewPager.setOffscreenPageLimit(2);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_home);
        tabLayout.setupWithViewPager(viewPager);

        ImageView menu_home      = (ImageView)findViewById(R.id.menu_home);
        ImageView menu_search    = (ImageView)findViewById(R.id.menu_search);
        ImageView menu_message   = (ImageView)findViewById(R.id.menu_message);
        ImageView menu_profil    = (ImageView)findViewById(R.id.menu_person);

        menu_home.setOnClickListener(tombolMenu);
        menu_search.setOnClickListener(tombolMenu);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        CommunityPagerAdapter adapter = new CommunityPagerAdapter(getSupportFragmentManager());
        FavoritCommunityFragment fragment_fav = new FavoritCommunityFragment();
        adapter.addFragment(fragment_fav, "FAVORIT");
        PopularCommunityFragment fragment_popular = new PopularCommunityFragment();
        adapter.addFragment(fragment_popular, "POPULAR");
        viewPager.setAdapter(adapter);
    }

    private View.OnClickListener tombolMenu = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.menu_home)
            {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
            else if(view.getId()==R.id.menu_search)
            {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        }
    };
}
