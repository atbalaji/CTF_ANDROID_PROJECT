package com.example.balaji.kproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Balaji on 6/10/2017.
 */

public class DisplayData extends AppCompatActivity {
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaydata);
        Bundle a = getIntent().getExtras();


        List<DataObject> data = new ArrayList<DataObject>();
        data.add(new DataObject(R.drawable.name2, (String) a.getCharSequence("Name")));
        data.add(new DataObject(R.drawable.dob2, (String) a.getCharSequence("DOB"))) ;
        data.add(new DataObject(R.drawable.year2, (String) a.getCharSequence("Year")));
        data.add(new DataObject(R.drawable.phone2, (String) a.getCharSequence("Phone")));

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        CustomPageAdapter mCustomPagerAdapter = new CustomPageAdapter(DisplayData.this, data);
        viewPager.setAdapter(mCustomPagerAdapter);
        // Get the Intent that started this activity and extract the string


         }


}
