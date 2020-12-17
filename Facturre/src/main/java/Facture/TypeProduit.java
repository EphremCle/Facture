package Facture;

public class TypeProduit {

    private double TVA;
    private int type;


    public TypeProduit(int type, double TVA){
        
        this.type = type;
        this.TVA = TVA;
        
    }


    public double getTVA() {
        return TVA;
    }

    public int getType() {
        return type;
    }

    public void setTVA(double TVA) {
        this.TVA = TVA;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
}
