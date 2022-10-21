package Java11;

interface Data {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
}

class CStu implements Data, Test {
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    CStu(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }

    public double calcu() {
        double ans = 0;
        ans = common * 0.4 + mid * 0.3 + finl * 0.3;
        return ans;
    }

    public void showData() {
        System.out.printf("ID: %s\n", id);
        System.out.printf("Name: %s\n", name);
    }

    public void showScore() {
        System.out.printf("mid: %d\n", mid);
        System.out.printf("finl: %d\n", finl);
        System.out.printf("commom: %d\n", common);
        double tmp = calcu();
        System.out.printf("AVG: %f\n", tmp);
    }

    public void show() {
        showData();
        showScore();
    }

}

public class Class11 {
    public static void main(String argv[]) {
        CStu stu = new CStu("940001", "Fiona", 90, 92, 95);
        stu.show();
    }
}