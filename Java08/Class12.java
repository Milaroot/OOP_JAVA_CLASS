package Java08;

class CWin {
    int width;
    int height;
    String name;

    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    public void show() {
        System.out.println("Name = " + name);
        System.out.println("W = " + width + ", H = " + height);
    }

    void setWindows(int w, int h) {
        width = w;
        height = h;
    }

    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }
}

public class Class12 {
    public static void main(String[] argv) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
    }
}
