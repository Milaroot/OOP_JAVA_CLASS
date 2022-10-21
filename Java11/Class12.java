package Java11;

interface Data {
    public void best();

    public void failed();
}

interface Test extends Data {
    public void showData();

    public double average();
}

class CStu implements Test {
    protected String name;

    protected int math;

    protected int english;

    CStu(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void best() {
        if (math > english) {
            System.out.printf("%s的數學比英文好", name);
        } else if (math < english) {
            System.out.printf("%s的英文比數學好", name);
        } else {
            System.out.printf("%s的成績一樣爛", name);
        }
    };

    public void failed() {
        if (math < 60) {
            System.out.printf("%s的數學被當了", name);
        }
        if (english < 60) {
            System.out.printf("%s的英文被當了", name);
        }
    };

    public void showData() {
        System.out.printf("姓名: %s\n", name);
        System.out.printf("數學成績: %d\n", math);
        System.out.printf("成績: %d\n", english);
        System.out.printf("平均成績: %f\n", average());
    };

    public double average() {
        return ((double) math + (double) english) / 2;
    };

    public void show() {
        showData();
        average();
    };
}

public class Class12 {
    public static void main(String argv[]) {
        CStu stu = new CStu("Judy", 58, 91);
        stu.show();
    }
}
