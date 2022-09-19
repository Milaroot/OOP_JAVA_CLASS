package Java09;

// hw9_3
class Caaa {
    private int value;

    public Caaa() {
        value = 10;
        System.out.println("value=" + value);
    }

    public Caaa(int i) {
        value = i;
        System.out.println("value=" + value);
    }

}

public class Class03 {
    public static void main(String[] argv) {
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);
    }
}