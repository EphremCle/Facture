package Facture;

public class Produit {

    private int code;
    private String libelle;
    private int prixHT;
    private double prixTTC;
    private TypeProduit typeProduit;
    private double prixTotalHT;
    private double prixTotalTTC;


    public Produit(int code, String libelle, int prixHT, TypeProduit typeProduit){

        this.code = code;
        this.libelle = libelle;
        this.prixHT = prixHT;
        this.typeProduit = typeProduit;


    }

    public double calculPrixTotalTTC() {

        return prixTTC = (prixHT + prixHT * typeProduit.getTVA());

    }


    public double calculerPrixTotalHT() {

        return prixTotalHT = Facture.getQte();


    }




    // GETTER / SETTER

    public int getCode() {

        return code;
    
    }

    public void setCode(int code) {

        this.code = code;

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(int prixHT) {
        this.prixHT = prixHT;
    }

    public double getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(int prixTTC) {
        this.prixTTC = prixTTC;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }
    

}