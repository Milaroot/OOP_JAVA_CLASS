package Java10;

class CRectangle {
    protected int length;
    protected int width;

    // Creates a CRectangle.
    CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    void println() {
        System.out.printf("length=%d, width=%d, area=%d", length, width, length * width);
    }
}

public class Class19 {
    public static void main(String[] argv) {
        CRectangle rect = new CRectangle(2, 6);
        rect.println();
    }

}