public class CompteBancaire {
    public int num;
    public double solde;
    public String nom="";

    public CompteBancaire(int num,double solde, String nom) {
        this.num =num;
        this.solde = solde;
        this.nom = nom;

    }

    public void DepotSolde(double montant) {
        this.solde = this.solde +montant;
    }

    public void RetirerSolde(double montant) {
        this.solde = this.solde - montant;

    }
    public void affichageCompte() {
        System.out.println("Num: " + this.num);
        System.out.println("Solde: " + this.solde);
        System.out.println("Nom: " + this.nom);
    }

    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(1,500.20,"Marc");
        CompteBancaire compte2 = new CompteBancaire(2,800,"Jean");


        compte1.RetirerSolde(20);

        compte1.affichageCompte();

        compte2.DepotSolde(500);
        compte2.affichageCompte();
    }

}
