// hw10_5

package Java10;

class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }
}

class Cbbb extends Caaa {
    // Sets the number of arguments to be passed to the callback.
    public Cbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num=" + get());
    }
}

public class Class05 {
    public static void main(String[] argv) {
        // Creates a new bb and displays it.
        Cbbb bb = new Cbbb(2);
        bb.show();
    }
}