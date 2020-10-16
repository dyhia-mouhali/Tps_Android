package com.example.tp2exo4;


public class Contacte {

    private String nom, prenom, numero;

    public Contacte( String nom,String prenom, String numero) {
        super();

        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }
   public Contacte() {
        super();

    }


    public String getNom() {
        return nom;
    }
    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom (String prenom) {
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero (String numero) {

        this.numero = numero;
    }

}