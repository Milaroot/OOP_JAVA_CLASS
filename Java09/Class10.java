package Java09;

class CRational {// 分數類別
    public int n;
    public int d;

    public void setN(int num) {
        n = num;
    }

    public void setD(int num) {
        d = num;
    }

    public void setND(int num, int den) {
        d = den;
        n = num;
    }

    public void show() {
        System.out.println(n + "/" + d);
    }
}

public class Class10 {

    public static void main(String[] argv) {
        CRational aaa = new CRational();
        aaa.setN(2);
        aaa.setD(5);
        aaa.show();
    }
}
