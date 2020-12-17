package Facture;

import java.security.KeyStore.Entry;
import java.util.Date;
import java.util.HashMap;


public class Facture {

    private double montantTTC;
    private HashMap<Produit, Integer> produits = new HashMap<Produit, Integer>();
    private double montantHT;
    private int id;
    private Date date;
    private static int qte;
    private Produit produit;

    public Facture(int id, Date date) {

        this.id = id;
        this.date = date;

    }

    public int afficherListe(Produit produit, Integer qte) {

        return produits.size();

    }

    public void ajouterProduit(Produit produit, Integer qte) {

        if (produits.containsKey(produit)) {
            produits.put(produit, produits.get(produit) + qte);

        } else {
            produits.put(produit, qte);
        }
    }

    public void retirerProduit(Produit produit, Integer qte) {

        produits.remove(produit, qte);
    }

    public static void getQteProduit() {

        for (Entry entry : produits.entrySet()) {
            System.out.println("clé: " + mapentry.getKey() + " | valeur: " + mapentry.getValue());
        }


    }

    
}
