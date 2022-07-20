package com.example.lunbo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPage;
    List<ContentFragment> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      viewPage = findViewById(R.id.vp);
      datas = new ArrayList<>();
      datas.add(new ContentFragment(R.drawable.t1));
      datas.add(new ContentFragment(R.drawable.t2));
      datas.add(new ContentFragment(R.drawable.t3));

      ContentPagerAdapter adapter =  new ContentPagerAdapter(this,datas);

      viewPage.setAdapter(adapter);
    }
}