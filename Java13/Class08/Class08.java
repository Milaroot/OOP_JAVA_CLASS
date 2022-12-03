package Class08;

class Ctest {
    public void test(int num, int den) throws ArithmeticException {
        int ans = num / den;
        System.out.println("end of main()!!");
    }
}

public class Class08 {
    public static void main(String argv[]) {
        try {
            Ctest a = new Ctest();
            a.test(12, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
