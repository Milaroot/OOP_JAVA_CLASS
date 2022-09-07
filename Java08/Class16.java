package Java08;

class CShere {
    private int x;
    private int y;
    private int z;
    private int radius;
    private double pi = 3.14;

    void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double volume() {
        return radius * radius * radius * pi * 4 / 3;
    }

    double surfaceArea() {
        return radius * radius * pi * 4;
    }

    void showCenter() {
        System.out.printf("[%d, %d, %d]\n", x, y, z);
    }

}

public class Class16 {
    public static void main(String[] argv) {
        CShere cs = new CShere();
        cs.setLocation(3, 4, 5);
        cs.setRadius(1);
    }
}
