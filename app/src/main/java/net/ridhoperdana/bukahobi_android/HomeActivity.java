package net.ridhoperdana.bukahobi_android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

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
}
