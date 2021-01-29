public class Eq2Degre {

    double a, b,c,delta,r1,r2;

    public Eq2Degre (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //methode caclcul delta

    public double calculDiscriminant(double a, double b, double c) {
        delta = ((b *b) - 4 * a * c);


        return delta;
    }

    public double resoudreEquation(double delta) {


        if(delta < 0) {
            System.out.println("pas de solution :");
        }else if(delta == 0) {
            System.out.println("admet une solution double : ");
            r1 = (-b/2*a);
        }else if (delta>0){
            System.out.println("admet deux solution :");
            r1 = (-b + Math.sqrt(delta)) / (2* this.a);
            r2 = (-b - Math.sqrt(delta)) / (2* this.a);
        }

    return delta;
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
        double sa=equation.calculDiscriminant(equation.a, equation.b, equation.c);
        equation.resoudreEquation(sa);
        equation.afficheSolution();

    }
}
