package Java09;

interface Math {
    void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

interface AdvancedMath {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

class Compute implements Math, AdvancedMath {
    private int ans = 0;

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    public void mod(int a, int b) {
        ans = a & b;
    }

    public void fac(int a) {
        int tmp = 1;
        for (int i = 1; i <= a; i++) {
            tmp *= i;
        }
        ans = tmp;
    }

    public void pow(int a, int b) {
        int tmp = a;
        for (int i = 0; i < a; i++) {
            tmp *= a;
        }
        ans = tmp;
    }

    public void show() {
        System.out.println("ans=" + ans);
    }

}

public class Class09 {
    public static void main(String argv[]) {
        Compute cmp = new Compute();
        cmp.mul(3, 5);
        cmp.show();
        cmp.mod(14, 5);
        cmp.show();
        cmp.fac(5);
        cmp.show();
    }
}