package Java11;

abstract class CShape {
    protected String color;

    public CShape(String str) {
        color = str;
    }

    public abstract void show();
}

class CRectangle extends CShape {
    int width, height;

    public CRectangle(int w, int h) {
        super("BLACK");
        width = w;
        height = h;
    }

    public void show() {
        System.out.printf("color = %s, area = %d\n", color, width * height);
    }
}

class CCircle extends CShape {
    double radius;

    public CCircle(double r) {
        super("BLUE");
        radius = r;
    }

    public void show() {
        System.out.printf("color = %s, area = %.2f\n", color, 3.14 * radius * radius);
    }
}

public class Class01 {
    public static void main(String[] args) {
        CRectangle rec = new CRectangle(5, 10);
        rec.show();

        CCircle cir = new CCircle(2.0);
        cir.show();
    }
}