package Java09;

class CCount {
    static int cnt = 0;

    CCount() {
        cnt++;
    }

    void setZero() {
        cnt = 0;
    }

    void setValue(int n) {
        cnt = n;
    }
}

public class Class05 {
    public static void main(String[] argv) {
        CCount test = new CCount();
        System.out.print(test.cnt);
        CCount test2 = new CCount();
        System.out.print(test2.cnt);
    }
}