package Class07;

public class Class07 {
    public static void test(int num, int den) throws ArithmeticException {
        int ans = num / den;
        System.out.println("end of main()!!");
    }

    public static void main(String argv[]) {
        try {
            test(12, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
