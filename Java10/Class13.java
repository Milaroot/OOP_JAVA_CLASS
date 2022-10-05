// hw10_13

package Java10;

class Caaa {
    public int num1;
    public int num2;

    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    public Caaa(int x, int y) {
        num1 = x;
        num2 = y;
    }

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

    public Cbbb() {
        super();
    }

    public Cbbb(int x, int y) {
        super(x, y);
    }
}

public class Class13 {
    public static void main(String[] argv) {
        // Display a 1 - 1 - bit block.
        Cbbb bb = new Cbbb();
        bb.show();
    }
}