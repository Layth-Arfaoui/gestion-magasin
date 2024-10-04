/*import java.util.Date;

public class Main {
    public static void main(String[] args) {
Produit produitVide =new Produit();
            System.out.println("Produit vide créé: " + produitVide);

Produit p1 =new Produit(1021,"lait","delice",13);
        Produit p2 =new Produit(2510,"yaourt","vitalait",0);
        Produit p3=new Produit(3250,"tomate","sicam",1200);
        System.out.println("\nProduits créés:");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        p1.prix = 700;
        System.out.println("Produit lait après modification:");
        p1.afficher();

        p2.prix = 500;
        p3.prix=900;

        System.out.println("\nProduits modifiés:");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        System.out.println("\nProduits avec toString():");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // 8. Ajouter la date d'expiration
        Date dateExpLait = new Date(2024, 9, 20);
        Date dateExpYaourt = new Date(2024, 10, 15);
        Date dateExpTomate = new Date(2025, 3, 10);

        p1.dateExpiration = dateExpLait;
        p2.dateExpiration = dateExpYaourt;
        p3.dateExpiration = dateExpTomate;

        // Afficher à nouveau les produits avec les dates d'expiration
        System.out.println("\nProduits avec date d'expiration:");
        p1.afficher();
        p2.afficher();
        p3.afficher();
            Magasin magasin1 = new Magasin("M1", "123 Rue A", 50);
            magasin1.ajouterProduit(new Produit(1,"car","car",20));
            magasin1.ajouterProduit(new Produit(2,"kinder","chocloate",50));

            Magasin magasin2 = new Magasin("M2", "456 Rue B", 50);
            magasin2.ajouterProduit(new Produit(6,"chargeur","chargeur",90));

            magasin1.afficherDetails();
            magasin2.afficherDetails();

            System.out.println("Total de produits  " + Magasin.getTotalProduits());
        Produit produitTest = new Produit(1, "car", "car", 20);
        System.out.println("Produit trouvé dans magasin1? " + magasin1.chercherProduit(produitTest));

        Magasin magasinAvecPlusDeProduits = Magasin.comparerMagasins(magasin1, magasin2);
        System.out.println("Magasin avec plus de produits: " + magasinAvecPlusDeProduits);

    }

    }
variable de classe */
public class Main {
    public static void main(String[] args) {
        Magasin magasin1 = new Magasin("M1", "123 Rue A", 50);
        magasin1.ajouterProduit(new Produit(1, "car", "car", 20));
        magasin1.ajouterProduit(new Produit(2, "kinder", "chocolat", 50));

        // Attempt to add a product with null libelle to check error handling
        Produit produitNullLibelle = new Produit(3, null, "marque", 30);
        magasin1.ajouterProduit(produitNullLibelle); // This should now handle the null case.

        Magasin magasin2 = new Magasin("M2", "456 Rue B", 50);
        magasin2.ajouterProduit(new Produit(6, "chargeur", "chargeur", 90));

        magasin1.afficherDetails();
        magasin2.afficherDetails();

        System.out.println("Total de produits: " + Magasin.getTotalProduits());

        Produit produitTest = new Produit(1, "car", "car", 20);
        System.out.println("Produit trouvé dans magasin1? " + magasin1.chercherProduit(produitTest));

        Magasin magasinAvecPlusDeProduits = Magasin.comparerMagasins(magasin1, magasin2);
        System.out.println("Magasin avec plus de produits: " + magasinAvecPlusDeProduits);
    }
}
