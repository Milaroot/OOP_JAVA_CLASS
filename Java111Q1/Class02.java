package Java111Q1;

class Data {
    private String name;
    private String score;
    Test tmp;

    class Test {
        int english;
        int math;

        Test(int eng, int m) {
            english = eng;
            math = m;
        }

        double avg() {
            return ((double) english + (double) math) / 2;
        }

    }

    Data(String x, int y, int z) {
        name = x;
        tmp = new Test(y, z);
    }

    void show() {
        System.out.printf("name: %s, english: %d, math: %d, avg = %.1f\n", name, tmp.english, tmp.math, tmp.avg());
    }
}

public class Class02 {
    public static void main(String[] main) {

        Data arr[] = new Data[2];
        arr[0] = new Data("Annie", 85, 92);
        arr[1] = new Data("Brian", 77, 56);
        arr[0].show();
        arr[1].show();
    }
}
