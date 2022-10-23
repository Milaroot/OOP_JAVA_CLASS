package Java11;

interface Show_ans {
    public void show();
}

interface Math extends Show_ans {
    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class Computer implements Math {
    private int ans;

    // Adds two ints.
    public void add(int a, int b) {
        ans = a + b;
    }

    // Subtracts two integers.
    public void sub(int a, int b) {
        ans = a - b;
    }

    // Multiply two numbers.
    public void mul(int a, int b) {
        ans = a * b;
    }

    // Divides two integers.
    public void div(int a, int b) {
        ans = a / b;
    }

    public void show() {
        System.out.println("ans = " + ans);
    }
}

public class Class13 {
    public static void main(String[] args) {
        Computer cmp = new Computer();
        cmp.mul(3, 5);
        cmp.show();
    }
}