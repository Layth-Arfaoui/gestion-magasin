import java.lang.reflect.Array;
import java.util.List;

public class Magasin {
    private String identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nombreProduits;
    private static int totalProduits = 0;

    public Magasin(String identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nombreProduits = 0;
    }

    public boolean ajouterProduit(Produit produit) {
        if (nombreProduits < capacite) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            totalProduits++;
            return true;
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale.");
            return false;
        }
    }
    public void afficherDetails() {
        System.out.println("Magasin ID: " + identifiant);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("Nom: " + produits[i].getLibelle() + ", Prix: " + produits[i].getPrix());
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }


}
