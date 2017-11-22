package it.alessandra.nuovarecyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by utente7.academy on 22/11/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Dipendente> dipendenti;
    public Context context;

    //costruttori della classe MyAdapter
    public MyAdapter(List<Dipendente> listaDip){
        dipendenti = listaDip;
    }

    public MyAdapter(List<Dipendente> listaDip, Context mcontext){
        dipendenti = listaDip;
        context = mcontext;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.riga, parent, false);

        ViewHolder vh = new ViewHolder(v,getContext());
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dipendente tmp=dipendenti.get(position);
        holder.nome.setText(tmp.getNome());
        holder.cognome.setText(tmp.getCognome());
        holder.matricola.setText(""+tmp.getMatricola());
    }

    @Override
    public int getItemCount() {
        return dipendenti.size();
    }

    //classe interna
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public CardView cardView;
        public TextView nome;
        public TextView cognome;
        public TextView matricola;

        //costruttore classe interna
        public ViewHolder(View v, final Context context){
            super(v);
            cardView = (CardView)itemView.findViewById(R.id.cardv);
            nome = (TextView) v.findViewById(R.id.nome);
            cognome = (TextView) v.findViewById(R.id.cognome);
            matricola = (TextView) v.findViewById(R.id.matricola);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    String s = nome.getText().toString() + " " + cognome.getText().toString() +" "+ matricola.getText().toString();
                    Toast.makeText(context,s,Toast.LENGTH_LONG).show();
                }
            });
        }

    }
    public Context getContext() {
        return context;
    }

}
