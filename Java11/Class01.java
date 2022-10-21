package Java11;

abstract class Cshape {
    protected String color;

    public void setColor(String str) {
        color = str;
    }

    public abstract void show();
}

class CCircle extends Cshape {
    protected double radius;

    public CCircle(double r) {
        radius = r;
    }

    public void show() {
        System.out.print("color=" + color + ".");
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class Class01 {
    public static void main(String[] args) {
        CCircle myCircle = new CCircle(48763);
        myCircle.setColor("blue&black");
        myCircle.show();
    }
}
