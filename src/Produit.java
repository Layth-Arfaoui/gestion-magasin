import java.util.Date;

public class Produit {
 int identifiant;
  String libelle;
 String marque;
 float prix;
    Date dateExpiration;

    public Produit() {
    }

    public Produit(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public void afficher() {
        System.out.println("Produit ID: " + identifiant);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
    }



}
