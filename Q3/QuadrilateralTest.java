class Point {
    private double x, y;
    public Point(double x, double y) { this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
}

abstract class Quadrilateral {
    private Point p1, p2, p3, p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3; this.p4 = p4;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }
    public Point getP4() { return p4; }

    public abstract double getArea();
}

class Rectangle extends Quadrilateral {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        double base = Math.abs(getP2().getX() - getP1().getX());
        double altura = Math.abs(getP4().getY() - getP1().getY());
        return base * altura;
    }
}

class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
}

public class QuadrilateralTest {
    public static void main(String[] args) {
        
        Point pr1 = new Point(0, 2); 
        Point pr2 = new Point(4, 2); 
        Point pr3 = new Point(4, 0); 
        Point pr4 = new Point(0, 0); 
        
        Quadrilateral retangulo = new Rectangle(pr1, pr2, pr3, pr4);
        System.out.println("Área do Retângulo: " + retangulo.getArea());
    }
}