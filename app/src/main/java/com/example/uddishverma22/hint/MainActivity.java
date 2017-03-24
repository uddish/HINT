package com.example.uddishverma22.hint;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.uddishverma22.hint.Fragments.Fragment1;
import com.example.uddishverma22.hint.Fragments.Fragment10;
import com.example.uddishverma22.hint.Fragments.Fragment11;
import com.example.uddishverma22.hint.Fragments.Fragment12;
import com.example.uddishverma22.hint.Fragments.Fragment13;
import com.example.uddishverma22.hint.Fragments.Fragment14;
import com.example.uddishverma22.hint.Fragments.Fragment15;
import com.example.uddishverma22.hint.Fragments.Fragment16;
import com.example.uddishverma22.hint.Fragments.Fragment17;
import com.example.uddishverma22.hint.Fragments.Fragment18;
import com.example.uddishverma22.hint.Fragments.Fragment2;
import com.example.uddishverma22.hint.Fragments.Fragment3;
import com.example.uddishverma22.hint.Fragments.Fragment4;
import com.example.uddishverma22.hint.Fragments.Fragment5;
import com.example.uddishverma22.hint.Fragments.Fragment6;
import com.example.uddishverma22.hint.Fragments.Fragment7;
import com.example.uddishverma22.hint.Fragments.Fragment8;
import com.example.uddishverma22.hint.Fragments.Fragment9;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    public static int age, gender, s_emp, family_his, treatment, work_interfere, no_of_emp, remotework, tech_comp, benefits,
            seekhelp, anonymity, leave, mental_cons, phys_health, coworkers, superwisers, ment_interview, phys_health_i, phyvsmen;

    //Static object that will be pushed to the server
    public static POJO pojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.view_pager1);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragments(new Fragment1());
        viewPagerAdapter.AddFragments(new Fragment2());
        viewPagerAdapter.AddFragments(new Fragment3());
        viewPagerAdapter.AddFragments(new Fragment4());
        viewPagerAdapter.AddFragments(new Fragment5());
        viewPagerAdapter.AddFragments(new Fragment6());
        viewPagerAdapter.AddFragments(new Fragment7());
        viewPagerAdapter.AddFragments(new Fragment8());
//        viewPagerAdapter.AddFragments(new Fragment9());
        viewPagerAdapter.AddFragments(new Fragment10());
        viewPagerAdapter.AddFragments(new Fragment11());
        viewPagerAdapter.AddFragments(new Fragment12());
        viewPagerAdapter.AddFragments(new Fragment13());
        viewPagerAdapter.AddFragments(new Fragment14());
        viewPagerAdapter.AddFragments(new Fragment15());
        viewPagerAdapter.AddFragments(new Fragment16());

        viewPager.setAdapter(viewPagerAdapter);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        pojo = new POJO(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
