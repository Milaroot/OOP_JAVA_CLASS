package Class03;

//hw13_3
public class Class03 {
    public static void main(String argv[]) {
        int num = 12, den = 0, ans = 0;
        try {
            ans = num / den;
        } catch (ArithmeticException ex) {
            System.out.println("除數為0");
        }
        System.out.println("end of main()!!");
    }
}
