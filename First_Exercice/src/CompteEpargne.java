public class CompteEpargne extends CompteBancaire{

    public double tauxInteret;

    public CompteEpargne(int num, double solde, String nom, double tauxInteret) {
        super(num, solde, nom);
        this.tauxInteret = tauxInteret;
    }

    public void calculInteret() {
        this.solde = this.solde*(1+this.tauxInteret/100);
    }

    public static void main(String[] args) {

    }

}
