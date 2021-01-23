public class Test extends Repondeur{

    Test(String repondeur, String msgHome) {
        super(repondeur, msgHome);
    }

    public static void main(String[] args) {
        Repondeur rep = new Repondeur("Objet creer depuis la classe Test","Msg Home");
        rep.AffichageRepondeur();

    }
}
