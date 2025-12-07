package org.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IMetier<Produit> metier = new MetierProduitImpl();

        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par id");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("Liste des produits :");
                    metier.getAll().forEach(System.out::println);
                }

                case 2 -> {
                    System.out.print("Entrer l'id : ");
                    int id = scanner.nextInt();
                    Produit p = metier.findById(id);
                    System.out.println(p != null ? p : "Produit non trouvé.");
                }

                case 3 -> {
                    System.out.print("Id : ");
                    int id = scanner.nextInt();
                    System.out.print("Nom : ");
                    String nom = scanner.next();
                    System.out.print("Marque : ");
                    String marque = scanner.next();
                    System.out.print("Description : ");
                    String desc = scanner.next();
                    System.out.print("stock : ");
                    int stock = scanner.nextInt();

                    Produit p = new Produit(id, nom, marque, desc, stock);
                    metier.add(p);

                    System.out.println("Produit ajouté !");
                }

                case 4 -> {
                    System.out.print("Entrer l'id du produit à supprimer : ");
                    int id = scanner.nextInt();
                    metier.delete(id);
                    System.out.println("Produit supprimé !");
                }

                case 5 -> {
                    System.out.println("Au revoir !");
                    running = false;
                }

                default -> System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
