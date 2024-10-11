public class Vendeur extends Employee{
    double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }

}
