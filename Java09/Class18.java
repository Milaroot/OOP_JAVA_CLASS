package Java09;

public class Class18 {

    public static void main(String[] argv) {
        int inp = 10;
        (new Object() {
            public void show() {
                CCircle c = new CCircle(inp);
                System.out.println(c.radius * c.radius * c.pi);
            }
        }).show();
    }

    static class CCircle {
        public double pi = 3.14;
        public double radius;

        public CCircle(double r) {
            radius = r;
        }
    }
}