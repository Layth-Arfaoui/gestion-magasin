public class Responsable extends Employee{
        double prime;

        public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
            super(id, nom, adresse, nbrHeures);
            this.prime = prime;
        }

        @Override
        public double calculerSalaire() {
            double salaire = nbrHeures * 10;
            if (nbrHeures > 160) {
                salaire += (nbrHeures - 160) * 10 * 0.20;  // 20% bonus for extra hours
            }
            return salaire + prime;
        }

        @Override
        public String toString() {
            return super.toString() + ", Responsable{" +
                    "prime=" + prime +
                    '}';
        }

    }
