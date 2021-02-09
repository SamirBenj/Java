public class Cercle {
    double rayon, centre;
    double Aire;


    public void Point() {
        this.centre = centre;
        this.rayon = rayon;
        this.Aire = Aire;
    }

    public void Point(double rayon, double centre,double Aire) {
        this.centre = centre;
        this.rayon = rayon;
        this.Aire = Aire;
    }

    public double getCentre() {
        return centre;
    }

    public double getRayon() {
        return rayon;
    }

    public double getAire() {
        return Aire;
    }

    public void setAire(double Aire) {
        Aire = Aire;
    }

    public void setCentre(double centre) {
        this.centre = centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double CalculerSurface(double rayon) {
             Aire = Math.PI * rayon * rayon;

            return Aire;
    }
    public double CalculCirconference(double rayon) {
        centre = 2*Math.PI * rayon;
        return centre;
    }

    public void AfficherResultat() {
        System.out.println("Aire du cercle = " + Aire);
        System.out.println("Circonference = " + centre);
    }

    public static void main(String[] args) {
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle();

        //Cercle 1
        System.out.println("Cercle 1 :");
        c1.CalculerSurface(5);
        c1.CalculCirconference(5);
        c1.AfficherResultat();



        //Cercle 2
        System.out.println("\nCercle 2 :");
        c2.CalculerSurface(2);
        c2.CalculCirconference(2);
        c2.AfficherResultat();

    }
}
