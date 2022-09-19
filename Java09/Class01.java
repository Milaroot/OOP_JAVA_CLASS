package Java09;

class CRectangle {
    int width;
    int height;

    CRectangle() {
        width = 10;
        height = 8;
    } // problem b without this()

    /*
     * CRectangle() {
     * this(10, 8);
     * } // problem c setting with this()
     */

    CRectangle(int w, int h) {
        width = w;
        height = h;
    }// problem a
}