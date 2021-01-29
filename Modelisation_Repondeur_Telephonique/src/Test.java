public class Test extends Repondeur{

    Test(String repondeur, String msgHome) {
        super(repondeur, msgHome);
    }

    public static void main(String[] args) {
        Repondeur rep = new Repondeur("Message du repondeur","Message Home");


        //Affichage message d'accueil
        rep.AffichageMessageAccueil();

        //Affichage message repondeur
        rep.AffichageRepondeur();
    }
}
