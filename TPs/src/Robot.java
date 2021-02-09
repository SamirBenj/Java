import com.sun.org.apache.xpath.internal.operations.Or;

public class Robot {
    String nom ="";
    int numero;
    int X, Y;

        int orientation;
    private static final int Nord = 0;
    private static final int Est = 1 ;
    private static final int Sud = 2 ;
    private static final int Ouest = 3 ;

    public Robot(/*int X, int Y,int Orientation*/) {
        this.X =0;
        this.Y = 0;
        this.orientation= 0;

    }

    public Robot(String nom , int Orientation) {
        this.nom =nom;
        this.orientation = Orientation;
    }

    public void Avancer(int a, int b) {
        X =  X + a;
        Y =  Y + b;
    }

    public void TournerDroite() {
        switch (orientation) {
            case Nord : orientation =Est ; break;
            case Est : orientation=Sud ; break;
            case Sud : orientation=Ouest; break;
            case Ouest: orientation=Nord ; break;
        }
    }

    public static void main(String[] args) {
        Robot r1 = new Robot("Jean",Nord);
        r1.TournerDroite();
        System.out.println(r1);

    }
}



