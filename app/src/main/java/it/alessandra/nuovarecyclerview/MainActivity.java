package it.alessandra.nuovarecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<Dipendente> dipendenti;
    Button aggiungi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dipendenti = init();
        final Dipendente nuovo = new Dipendente("Francesca","Grasso",88);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerv);
        aggiungi = (Button) findViewById(R.id.bnome);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final MyAdapter myAdapter = new MyAdapter(dipendenti,getApplicationContext());
        recyclerView.setAdapter(myAdapter);

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dipendenti.add(nuovo);
                myAdapter.notifyDataSetChanged();
            }
        });



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
