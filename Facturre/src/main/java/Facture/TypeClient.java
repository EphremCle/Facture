package Facture;

public class TypeClient {

    private String particulier;    
    private String entreprise;

    public TypeClient(String particulier, String entreprise){

        this.particulier = particulier;
        this.entreprise = entreprise;

    }








    
    public String getParticulier() {
        return particulier;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public void setParticulier(String particulier) {
        this.particulier = particulier;
    }


    
}
