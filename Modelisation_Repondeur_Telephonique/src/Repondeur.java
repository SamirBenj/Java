public class Repondeur extends Message {

    public String messageEnregistrer ="";
    public String msgHome= "";

    public Repondeur() {
        this.messageEnregistrer = "";
        this.msgHome = "Bonjour Bienvenue dans l'accueil";
    }

    public void AffichageRepondeur() {
            //System.out.println(messageEnregistrer);
            System.out.println("Message enregistré");
    }

    public void AffichageMessageAccueil() {
        System.out.println(msgHome);
    }

    public void setMessageAccueil(String msgHome) {
        this.msgHome = msgHome;
    }

    public String getMessageEnregistrer() {
        return messageEnregistrer;
    }

    public static void main(String[] args) {
        //Creation de l'objet repondeur
        Repondeur repondeur1 = new Repondeur();


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
