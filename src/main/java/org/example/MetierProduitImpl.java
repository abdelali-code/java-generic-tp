package org.example;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    List<Produit> produits = new ArrayList<>();
    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits.stream().toList();
    }

    @Override
    public Produit findById(long id) {
        return produits.stream().filter(produit -> produit.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(long t) {
       produits.removeIf(pr -> pr.getId() == t);
    }
}
