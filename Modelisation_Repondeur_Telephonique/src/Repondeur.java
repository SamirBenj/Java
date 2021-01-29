public class Repondeur extends Message {

    public String messageEnregistrer ="";
    public String msgHome= "";

    Repondeur(String messageEnregistrer,String msgHome) {
        this.messageEnregistrer = messageEnregistrer;
        this.msgHome = msgHome;
    }

    public void AffichageRepondeur() {
            //System.out.println(messageEnregistrer);
            System.out.println(msgHome);
    }
    public void AffichageMessageAccueil() {
        System.out.println(msgHome);
    }


    public static void main(String[] args) {
        //Creation de l'objet repondeur
        Repondeur repondeur1 = new Repondeur("Message du Repondeur","Message d'accueil");

        //Affichage message d'accueil
        repondeur1.AffichageMessageAccueil();

        //Affichage message repondeur
        repondeur1.AffichageRepondeur();

        //Utilisation de la classe Message
        Message message = new Message();
        message.set("Salut de la classe Message");
        message.get();
        System.out.println(message.get());
    }

}
