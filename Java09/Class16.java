package Java09;

class CCircle1 {
    private static double pi = 3.14;
    private double radius;

    public CCircle1(double r) {
        radius = r;
    }

    public void show() {
        System.out.printf("Radius= %.1f, area= %.2f\n", radius, pi * radius * radius);
    }
}

public class Class16 {
    public static void main(String[] args) {
        CCircle1 cir[] = new CCircle1[5];
        for (int i = 0; i < cir.length; i++) {
            cir[i] = new CCircle1(i);
            System.out.printf("c[%d]: ", i);
            cir[i].show();
        }
    }
}