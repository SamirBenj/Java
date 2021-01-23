public class Repondeur extends Message {

    public String repondeur ="";
    public String msgHome= "";

    Repondeur(String repondeur,String msgHome) {
        this.repondeur = repondeur;
        this.msgHome = msgHome;
    }

    public void AffichageRepondeur() {
            System.out.println(this.repondeur);
            System.out.println(this.msgHome);

    }




    public static void main(String[] args) {
        //creation de l'objet repondeur
        Repondeur repondeur1 = new Repondeur("Message du Repondeur","Message Home");
        //creation de l'objet message
        Message message = new Message();

        repondeur1.AffichageRepondeur();

        message.set("Salut de la classe Message");
        message.get();
        System.out.println(message.get());
    }

}
