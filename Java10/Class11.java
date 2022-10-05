package Java10;

class CShape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends CShape {
    int r;

    CCircle(int x) {
        r = x;
    }

    @Override
    public double area() {
        return r * r * 3.14;
    }

}

class CSquare extends CShape {
    int r;

    CSquare(int x) {
        r = x;
    }

    @Override
    public double area() {
        return r * r;
    }

}

class CTriangle extends CShape {
    int r;

    CTriangle(int x) {
        r = x;
    }

    @Override
    public double area() {
        return (r * r) * (Math.sqrt(3) / 4);
    }

}

public class Class11 {
    public static double largest(double d, double e, double f, double g, double h, double i) {
        return Math.max(d, Math.max(e, Math.max(f, Math.max(g, Math.max(h, i)))));
    }

    public static void main(String[] argv) {
        CCircle a1 = new CCircle(2);
        CSquare a2 = new CSquare(2);
        CTriangle a3 = new CTriangle(2);

        CCircle b1 = new CCircle(4);
        CSquare b2 = new CSquare(4);
        CTriangle b3 = new CTriangle(4);
        System.out.println(largest(a1.area(), a2.area(), a3.area(), b1.area(), b2.area(), b3.area()));
    }
}