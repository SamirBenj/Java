public class Eq2Degre {

    double a, b,c,delta,r1,r2;

    Eq2Degre (double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }

    //methode caclcul delta

    public void calculDiscriminant() {
        delta = ((this.b *this.b) - 4 * this.a * this.c);

    }

    public void resoudreEquation() {
        //delta = ((this.b *this.b) - 4 * this.a * this.c);

        r1 = ((-this.b + Math.sqrt(delta)) / 2* this.a);
        r2 = ((-this.b - Math.sqrt(delta)) / 2* this.a);

        if(delta < 0) {
            System.out.println("Admet pas de solution ");
        }else if(delta == 0) {
                System.out.println("admet une solution double ");
        }else{
            System.out.println("admet deux solution :");
        }

    }

    public void afficheSolution() {


        System.out.println("Racine 1 =" + r1);
        System.out.println("Racine 2 = " + r2);
    }
        public static void main(String[] args) {

        Eq2Degre equation = new Eq2Degre(-2,1,3);
        /*
        equation.a = 1;
        equation.b = -4;
        equation.c = 1;
*/
        equation.calculDiscriminant();
        equation.resoudreEquation();
        equation.afficheSolution();

    }
}