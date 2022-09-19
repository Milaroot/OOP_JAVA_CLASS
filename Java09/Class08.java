package Java09;

class CWin {
    static int cnt = 0;
    String color;
    int width;
    int height;

    // CWin() {
    // cnt++;
    // } problem a without color ...

    CWin() {
        count();
        color = "Red";
        width = 2;
        height = 2;
    }

    CWin(String str, int w, int h) {
        count();
        color = str;
        width = w;
        height = h;
    }

    void setZero() {
        cnt = 0;
    }

    void setValue(int n) {
        cnt = n;
    }

    void count() {
        cnt++;
    }

}

public class Class08 {

    public static void main(String[] argv) {
        // (f)類別
        // (g)實例
    }
}