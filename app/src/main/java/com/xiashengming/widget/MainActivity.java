package com.xiashengming.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.xiashengming.widget.looppagerecyclerview.LooperLayoutManager;
import com.xiashengming.widget.looppagerecyclerview.MyAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> mList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new MyAdapter());
        LooperLayoutManager layoutManager = new LooperLayoutManager();
        layoutManager.setLooperEnable(true);
        recyclerView.setLayoutManager(layoutManager);
    }

}
