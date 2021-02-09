public class RepondeurTest {

    double  numero;
    double solde;
    String IdentiteProprietaire ="";

     RepondeurTest(double numero, double solde, String  IdentiteProprietaire){

        this.numero = numero;
        this.solde = solde;
        this.IdentiteProprietaire = IdentiteProprietaire;


    }

    public void Affiche(){

        System.out.println("Numero = " + numero);
        System.out.println("Solde = " + solde);
        System.out.println("Identiter du Proprietaire = " + IdentiteProprietaire);
    }

    public double debitCompte(double solde){
        this.solde = solde - solde;
        return  solde;

    }

    public double CreditCompte (double solde){
        this.solde = this.solde + solde;
        return  solde;

    }

    public static void main (String args[]) {

        RepondeurTest comp1= new RepondeurTest(25,879.65,"Paul");

        comp1.Affiche();
        comp1.debitCompte(20)
        comp1.CreditCompte(200);
        comp1.Affiche();

    }

}
