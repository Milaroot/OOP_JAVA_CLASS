package Java10;

class CShape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends CShape {
    double radius;

    public CCircle(double r) {
        radius = r;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class CSquare extends CShape {
    double side;

    public CSquare(double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }
}

class CTriangle extends CShape {
    double base, height;

    public CTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return (base * height) / 2;
    }
}

public class Class12 {
    public static void main(String[] args) {
        CShape s[] = new CShape[6];
        s[0] = new CCircle(2);
        s[1] = new CCircle(3);
        s[2] = new CSquare(2);
        s[3] = new CSquare(3);
        s[4] = new CTriangle(3, 4);
        s[5] = new CTriangle(5, 6);
        for (int i = 0; i < s.length; i++)
            System.out.printf("s[%d] = %.1f\n", i, s[i].area());
        System.out.printf("largest = %.1f\n", largest(s));
    }

    public static double largest(CShape[] s) {
        double max = s[0].area();
        for (int i = 0; i < s.length; i++) {
            if (max < s[i].area())
                max = s[i].area();
        }
        return max;
    }
}