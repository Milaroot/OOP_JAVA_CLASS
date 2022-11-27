package Class09.sub1;

public class CSphere {
    double radius = 0;

    public CSphere(double r) {
        radius = r;
    }

    public void show() {
        System.out.println(Math.pow(radius, 3) * 4 / 3.0 * 3.1415926535897931);
    }
}
