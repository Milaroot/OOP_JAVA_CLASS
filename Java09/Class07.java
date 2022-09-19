package Java09;

public class Class07 {
    public static int power(int x, int n) {
        return (int) Math.pow(x, n);
    }

    public static void main(String[] argv) {
        System.out.println(power(2, 5));
        System.out.println(power(3, 2));
    }
}