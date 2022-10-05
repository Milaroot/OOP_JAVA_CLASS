package Java111Q1;

class sol {
    void Cal_area(int x) {
        System.out.printf("半徑 = %d", x);
        System.out.printf("球型體積 = %f", (4 / 3) * 3.14159 * (x * x * x));
    }

    void Cal_area(int x, int y, int z) {
        System.out.printf("長 = %d, 寬 = %d, 高 = %d", x, y, z);
        System.out.printf("立方體表面積 = %d", 2 * (x * y) + 2 * (x * z) + 2 * (y * z));

    }

}

public class Class01 {
    public static void main(String[] main) {
        sol s1 = new sol();
        s1.Cal_area(10);
        s1.Cal_area(4, 5, 6);
    }
}