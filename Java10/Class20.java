package Java10;

class CRectangle {
    protected int length;
    protected int width;

    // Creates a CRectangle.
    CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    public String toString() {
        return "none";
    }

    public String toString(int x, int y) {
        if (x >= y) {
            return Integer.toString(x) + " " + Integer.toString(y);
        } else {
            return "Argument Error";
        }
    }

    void println() {
        System.out.printf("length=%d, width=%d, area=%d", length, width, length * width);
    }
}

public class Class20 {
    public static void main(String[] argv) {
        CRectangle rect = new CRectangle(2, 6);
        rect.println();
    }

}