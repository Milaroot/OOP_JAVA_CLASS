package Java09;

public class Class06 {
    public static int add2n(int n) {
        double total_sum = 0;
        total_sum = (1 + n) * ((double) n / (double) 2);
        return (int) total_sum;
    }

    public static void main(String[] argv) {
        System.out.println(add2n(100));
    }
}