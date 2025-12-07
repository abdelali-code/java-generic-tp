package org.example;

public class Application {
    public static void main(String[] args) {

        Produit produit = new Produit(1, "test", "marque", "description", 100);
        IMetier<Produit> produitIMetier = new MetierProduitImpl();
        produitIMetier.add(produit);
        System.out.println(produitIMetier.getAll().size());
        System.out.println(produitIMetier.findById(1));
        produitIMetier.delete(1);
        System.out.println(produitIMetier.getAll().size());
    }
}