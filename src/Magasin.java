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
        // Check if the product is already in the store
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].comparer(produit)) {
                System.out.println("Le produit est déjà présent dans le magasin.");
                return false;
            }
        }

        // Check if there's capacity to add the product
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
            System.out.println(produits[i]);
        }
    }

    public boolean chercherProduit(Produit produit) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }

    public static Magasin comparerMagasins(Magasin magasin1, Magasin magasin2) {
        return magasin1.nombreProduits > magasin2.nombreProduits ? magasin1 : magasin2;
    }

    public static int getTotalProduits() {
        return totalProduits;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "identifiant='" + identifiant + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                ", nombreProduits=" + nombreProduits +
                '}';
    }
}
