package com.abhishek.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
TabLayout tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.vp);

        PageAdapter p=new PageAdapter(getSupportFragmentManager());
    viewPager.setAdapter(p);
        tb=findViewById(R.id.tb);
        tb.setupWithViewPager(viewPager,true);
    }
}
