package Java10;

class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

class CData extends CTriangle {
    CData(int x, int y) {
        base = x;
        height = y;
    }

    public double area() {
        return base * height / 2;
    }

    // Override and prints the base height and area.
    @Override
    protected void show() {
        System.out.println("base=" + base + ", height=" + height + ", area=" + area());
    }

}

public class Class06 {
    public static void main(String[] argv) {
        // Creates a new bb and displays it.
        CData obj = new CData(3, 8);
        obj.show();
    }
}