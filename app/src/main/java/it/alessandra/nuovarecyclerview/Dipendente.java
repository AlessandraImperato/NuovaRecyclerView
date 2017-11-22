package it.alessandra.nuovarecyclerview;

/**
 * Created by utente7.academy on 22/11/2017.
 */

public class Dipendente {
    private String nome;
    private String cognome;
    private int matricola;

    public Dipendente (){
        this.nome = null;
        this.cognome = null;
        this.matricola = 0;
    }

    public Dipendente(String nome, String cognome, int matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
