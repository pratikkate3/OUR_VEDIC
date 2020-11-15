package com.binni.ourvedic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.RecyclerAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.RecyclerModel;

import java.util.ArrayList;

public class HinduActivity extends AppCompatActivity {
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindu);

        list = findViewById(R.id.list);

        ArrayList<HinduModel> items = new ArrayList<>();



        items.add(new HinduModel(R.drawable.fruits,"Fruits"));
        items.add(new HinduModel(R.drawable.dhoop,"dhup"));
        items.add(new HinduModel(R.drawable.agarbatti,"AgarBatti"));
        items.add(new HinduModel(R.drawable.gulabjal,"GulabJal"));
        items.add(new HinduModel(R.drawable.kumkum,"kumkum"));
        items.add(new HinduModel(R.drawable.nariyal,"Nariyal"));
        items.add(new HinduModel(R.drawable.camphor,"Camphor"));
        items.add(new HinduModel(R.drawable.diya,"Diya"));
        items.add(new HinduModel(R.drawable.flowers,"Flowers"));






        HinduAdapter adapter = new HinduAdapter(items,HinduActivity.this);
        list.setAdapter(adapter);


        LinearLayoutManager layout = new LinearLayoutManager(HinduActivity.this);
        list.setLayoutManager(layout);

//
//        GridLayoutManager layout = new GridLayoutManager(HinduActivity.this,2);
//        list.setLayoutManager(layout);

    }
}