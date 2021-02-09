public class Point {
    int x, y;

    public Point() {
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }


    public void DeplacerPoint(int a, int b) {
                x = x +a;
                y = y +b;

    }

        public void AfficherPoint() {
        System.out.println("coordonnées du point ("+x+","+y+")");

        }
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        //Point 1
        System.out.println("Point 1 :");
        p1.setX(1);
        p1.setY(8);
        p1.DeplacerPoint(100,100);
        p1.AfficherPoint();


        //Point 2
        System.out.println("\nPoint 2 :");
        p2.setX(10);
        p2.setY(1);
        p2.DeplacerPoint(100,100);
        p2.AfficherPoint();
    }
}


