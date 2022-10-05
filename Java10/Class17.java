package Java10;

class Car {
    protected String owner;
    protected String id;

    Car(String x, String y) {
        owner = x;
        id = y;
    }

    final void show() {
        System.out.println("車主車牌" + owner);
        System.out.println("車牌號碼" + id);
    }
}

class CColor extends Car {
    String color;

    CColor(String x, String y, String z) {
        super(x, y);
        color = z;
    }

    @Override
    void show() {
        System.out.println("車主車牌" + owner);
        System.out.println("車牌號碼" + id);
        System.out.println("車身顏色" + color);
    }

}

public class Class17 {

    public static void main(String[] argv) {
        CColor mycar = new CColor("Riaan", "A-2345", "Black");

    }
}