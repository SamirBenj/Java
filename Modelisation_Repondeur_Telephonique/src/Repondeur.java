public class Repondeur extends Message {

    public String messageEnregistrer ="";
    public String msgHome= "";

    Repondeur(String messageEnregistrer,String msgHome) {
        this.messageEnregistrer = messageEnregistrer;
        this.msgHome = msgHome;
    }

    public void AffichageRepondeur() {
            System.out.println(this.messageEnregistrer);
            System.out.println(this.msgHome);
    }


    public static void main(String[] args) {
        //Creation de l'objet repondeur
        Repondeur repondeur1 = new Repondeur("Message du Repondeur","Message d'accueil");


        //Creation de l'objet message
        Message message = new Message();
        repondeur1.AffichageRepondeur();

        //Utilisation de la classe Message
        message.set("Salut de la classe Message");
        message.get();
        System.out.println(message.get());
    }

}
