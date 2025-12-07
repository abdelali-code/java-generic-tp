package org.example;

public class Produit {
    private int id;
    private String nom;
    private String marque;
    private String description;
    private int stockNbr;


    public Produit(int id, String nom, String marque, String description, int stockNbr) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.stockNbr = stockNbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockNbr() {
        return stockNbr;
    }

    public void setStockNbr(int stockNbr) {
        this.stockNbr = stockNbr;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", description='" + description + '\'' +
                ", stockNbr=" + stockNbr +
                '}';
    }
}
