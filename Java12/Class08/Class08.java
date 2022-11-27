package Class08;

import Class08.subpack1.subsubpack.CStyle;
import Class08.subpack1.CCircle;
import Class08.subpack2.CRectangle;

public class Class08 {
    public static void main(String[] args) {
        CStyle cs = new CStyle(1);
        CCircle c1 = new CCircle();
        CRectangle c2 = new CRectangle();
        c1.show();
        c2.show();
    }
}