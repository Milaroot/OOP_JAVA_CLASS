// hw10_1

package Java10.Class01;

class Caaa {
    public int num1;
    public int num2;
}

// Displays the number of two Caaa objects.
class Cbbb extends Caaa {

    void set_num(int x, int y) {
        num1 = x;
        num2 = y;
    }

    void show() {
        System.out.printf("%d %d", num1, num2);
    }

}

public class Class01 {
    public static void main(String[] argv) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}