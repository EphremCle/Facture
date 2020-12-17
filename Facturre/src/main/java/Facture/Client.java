package Facture;

public class Client {

    private String mail;
    private String nom;
    private enum TypeClient{entreprise, particulier}

    public Client(String mail, String nom) {

        this.mail = mail;
        this.nom = nom;

    }
    
}
