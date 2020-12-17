package Facture;

public class LigneProduit {

    private int quantite;
    private Produit produit;

    public void LigneProduit(int quantite, Produit produit) {
        this.quantite = quantite;
        this.produit = produit;
    }


    public int getQuantite() {
        return quantite;
    }
    
}
