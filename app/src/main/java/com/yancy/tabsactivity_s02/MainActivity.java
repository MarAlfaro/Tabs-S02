package com.yancy.tabsactivity_s02;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.yancy.tabsactivity_s02.ui.main.SectionsPagerAdapter;
import com.yancy.tabsactivity_s02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    TabLayout tabs;
    private int[] losIconos = {
            R.drawable.icono_quiensoy,
            R.drawable.icono_queestudio,
            R.drawable.icono_tecnologias
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        configurarIconos();



    }
    public void configurarIconos(){
        tabs.getTabAt(0).setIcon(losIconos[0]);
        tabs.getTabAt(1).setIcon(losIconos[1]);
        tabs.getTabAt(2).setIcon(losIconos[2]);

    }
}