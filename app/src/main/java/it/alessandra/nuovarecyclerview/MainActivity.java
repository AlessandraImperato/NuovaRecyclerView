package it.alessandra.nuovarecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<Dipendente> dipendenti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dipendenti = init();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerv);


        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final MyAdapter myAdapter = new MyAdapter(dipendenti,getApplicationContext());
        recyclerView.setAdapter(myAdapter);


    }

    public List<Dipendente> init(){
        List<Dipendente> listaDipendenti = new ArrayList<>();

        Dipendente d1 = new Dipendente("Alessandra", "Imperato", 19);
        Dipendente d2 = new Dipendente("Barbara", "Attanasio",28);
        Dipendente d3 = new Dipendente("Giuseppe", "Aiello", 35);

        listaDipendenti.add(d1);
        listaDipendenti.add(d2);
        listaDipendenti.add(d3);

        return listaDipendenti;
    }

}
