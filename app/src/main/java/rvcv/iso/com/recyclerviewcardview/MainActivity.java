package rvcv.iso.com.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private boolean isLinear = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isLinear){

                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,
                            StaggeredGridLayoutManager.VERTICAL));
                    recyclerView.setAdapter(adapter);
                    isLinear = false;
                }else{
                    recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                    recyclerView.setAdapter(adapter);
                    isLinear = true;
                }

            }
        });
    }

    private void init() {
        this.recyclerView = findViewById(R.id.recycler_view);
        this.layoutManager = new LinearLayoutManager(getBaseContext());
        this.adapter = new RViewAdapter(getBaseContext(), getListaCoche());
    }

    private ArrayList<Coche> getListaCoche() {
        ArrayList<Coche> arrayListCoches = new ArrayList<>();

        arrayListCoches.add(new Coche(R.drawable.mclaren_p1, "McLaren P1"));
        arrayListCoches.add(new Coche(R.drawable.bugatti_chiron, "Bugatti Chiron"));
        arrayListCoches.add(new Coche(R.drawable.ferrari_f12, "Ferrari F12 Novitec Rosso"));
        arrayListCoches.add(new Coche(R.drawable.lamborghini_aventador_sv, "Lamborghini Aventador SV"));
        arrayListCoches.add(new Coche(R.drawable.koenigsegg_agera_xs, "Koenigsegg Agera Xs"));
        arrayListCoches.add(new Coche(R.drawable.zonda_pagani, "Pagani Zonda Fantasma"));

        arrayListCoches.add(new Coche(R.drawable.mclaren_p1, "McLaren P1"));
        arrayListCoches.add(new Coche(R.drawable.bugatti_chiron, "Bugatti Chiron"));
        arrayListCoches.add(new Coche(R.drawable.ferrari_f12, "Ferrari F12 Novitec Rosso"));
        arrayListCoches.add(new Coche(R.drawable.lamborghini_aventador_sv, "Lamborghini Aventador SV"));
        arrayListCoches.add(new Coche(R.drawable.koenigsegg_agera_xs, "Koenigsegg Agera Xs"));
        arrayListCoches.add(new Coche(R.drawable.zonda_pagani, "Pagani Zonda Fantasma"));
        arrayListCoches.add(new Coche(R.drawable.mclaren_p1, "McLaren P1"));
        arrayListCoches.add(new Coche(R.drawable.bugatti_chiron, "Bugatti Chiron"));
        arrayListCoches.add(new Coche(R.drawable.ferrari_f12, "Ferrari F12 Novitec Rosso"));
        arrayListCoches.add(new Coche(R.drawable.lamborghini_aventador_sv, "Lamborghini Aventador SV"));
        arrayListCoches.add(new Coche(R.drawable.koenigsegg_agera_xs, "Koenigsegg Agera Xs"));
        arrayListCoches.add(new Coche(R.drawable.zonda_pagani, "Pagani Zonda Fantasma"));
        arrayListCoches.add(new Coche(R.drawable.mclaren_p1, "McLaren P1"));
        arrayListCoches.add(new Coche(R.drawable.bugatti_chiron, "Bugatti Chiron"));
        arrayListCoches.add(new Coche(R.drawable.ferrari_f12, "Ferrari F12 Novitec Rosso"));
        arrayListCoches.add(new Coche(R.drawable.lamborghini_aventador_sv, "Lamborghini Aventador SV"));
        arrayListCoches.add(new Coche(R.drawable.koenigsegg_agera_xs, "Koenigsegg Agera Xs"));
        arrayListCoches.add(new Coche(R.drawable.zonda_pagani, "Pagani Zonda Fantasma"));

        return arrayListCoches;
    }
}
