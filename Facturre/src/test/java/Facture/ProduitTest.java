package Facture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProduitTest {
    /**
     * Rigorous Test.
     */
    @Test    
    void produitSansTVA_getPrixTTC_renvoiePrixTTC() {

        // ARRANGE

        TypeProduit pasDeTVA = new TypeProduit(0, 0);
        int prixHT = 100;
        Produit p = new Produit(1, "produit", prixHT, pasDeTVA);

        // AGIS

        double res = p.calculPrixTotalTTC();

        // ASSERT

        assertEquals(prixHT, res, "devrait renvoyer le prix ht");

    }

    @Test
    void produitAvecTVA_calculPrixTotalTTC_renvoiePrixTTC() {

        // ARRANGE

        TypeProduit pasDeTVA = new TypeProduit(1, 2.0);
        int prixHT = 100;
        Produit p = new Produit(1, "produit", prixHT, pasDeTVA);

        // AGIS        

        double res = p.calculPrixTotalTTC();

        // ASSERT

        assertEquals(300, res, "devrait renvoyer le prix TTC");

    }

    

}