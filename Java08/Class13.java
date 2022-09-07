package Java08;

class CCircle {
    double pi = 3.14;

    double area(double r) {
        return r * r * pi;
    }

    float area(float r) {
        return (float) r * (float) r * (float) pi;
    }

    int area(int r) {
        return (int) (r * r * pi);
    }
}

public class Class13 {
    public static void main(String[] argv) {
        CCircle c = new CCircle();
        System.out.println(c.area(2));
        System.out.println(c.area(2.2f));
        System.out.println(c.area(2.2));
    }
}
