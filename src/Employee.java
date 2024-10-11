public class Employee {
    int id;
    String nom;
    String adresse;
    int nbrHeures;

    public Employee(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public double calculerSalaire() {
        return 0;  // To be overridden by subclasses
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbrHeures=" + nbrHeures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employe = (Employee) o;
        return id == employe.id &&
                nbrHeures == employe.nbrHeures &&
                nom.equals(employe.nom) &&
                adresse.equals(employe.adresse);
    }
}
