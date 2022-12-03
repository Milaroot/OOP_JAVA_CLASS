package Class12;

class NotTriangle extends Exception {
}

class EquilateraTriangle extends Exception {
}

class NotEquilateraTriangle extends Exception {
}

public class Class12 {
    static void triangle(int a, int b, int c) throws NotTriangle, EquilateraTriangle, NotEquilateraTriangle {
        if ((a + b) < c || (b + c) < a || (c + a) < b) {
            System.out.println("不構成三角形");
            throw new NotTriangle();
        } else if (a == b && a == c && b == c) {
            System.out.println("這是正三角形");
            throw new EquilateraTriangle();
        } else {
            System.out.println("這不是正三角形");
            throw new NotEquilateraTriangle();
        }
    }

    public static void main(String argv[]) {
        int a = 3, b = 3, c = 3;

        try {
            triangle(a, b, c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}