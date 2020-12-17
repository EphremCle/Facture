package Facture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

class FactureTest {

    @Test
    void listeVide_AjoutElement_Renvoie1() {

        // ARRANGE

        Facture facture = new Facture(0, null);

        Produit prod = new Produit(0, "t", 0, null);
      // AGIS

        facture.ajouterProduit(prod, 1);
        
        // ASSERT

        assertEquals(facture.afficherListe(prod, 2), 1, "doit renvoyer 1");

    }

    @Test
    void listePleine_RemoveElement_Renvoie0() {

        // ARRANGE

        Facture facture = new Facture(0, null);

        Produit prod = new Produit(0, "t", 0, null);

        facture.ajouterProduit(prod, 1);

        // AGIS

        facture.retirerProduit(prod, 1);

        // ASSERT

        assertEquals(facture.afficherListe(prod, 1), 0, "doit renvoyer 1");

    }

    @Test
    void liste_CompteNbrElements_RenvoieNbrElements() {

        // ARRANGE

        

        // AGIS

        // ASSERT
    }

    void Liste_compteNbrQteTotale_RenvoieNbrQteTotale() {

        Facture facture = new Facture(0, null);

        Produit prod = new Produit(0, "t", 0, null);

        facture.ajouterProduit(prod, 1);

        // AGIS

        facture.getQteProduit(prod);

        //ASSERT 

        assertEquals(facture.getQteProduit(), 1);

    }

}