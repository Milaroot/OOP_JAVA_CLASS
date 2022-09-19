package Java09;

class Date {
    class Test {
        int english;
        int math;

        Test(int eng, int m) {
            english = eng;
            math = m;
        }

        public double avg() {
            return ((double) (english + math)) / 2.0;
        }

        public void show() {
            System.out.println("英文成績" + english);
            System.out.println("數學成績" + math);
            System.out.println("平均成績" + avg());
        }
    }

    private String name;
    private Test score;

    Date(String n, int en, int m) {
        name = n;
        score = new Test(en, m);
    }

    void show() {
        System.out.println("學生姓名" + name);
        score.show();
    }
}

public class Class19 {

    public static void main(String[] argv) {
        Date stu = new Date("Annie", 85, 92);
        stu.show();
    }
}