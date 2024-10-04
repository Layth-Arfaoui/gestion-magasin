import java.util.Date;

public class Produit {
    int identifiant;
    String libelle;
    String marque;
    float prix;
    Date dateExpiration;

    public Produit(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }
// Getters and Setters...

    public boolean comparer(Produit autreProduit) {
        if (autreProduit == null) return false;

        return this.identifiant == autreProduit.identifiant &&
                (this.libelle == null ? autreProduit.libelle == null : this.libelle.equals(autreProduit.libelle)) &&
                this.prix == autreProduit.prix;
    }

    public static boolean comparer(Produit produit1, Produit produit2) {
        return produit1.comparer(produit2);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
