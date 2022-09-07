package Java08;

class CTest {
    void test(int inp) {
        if (inp == 0) {
            System.out.println("此數為 0 ");
        } else if (inp % 2 == 0) {
            System.out.println("此數為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }
}

class Class07 {
    public static void main(String argv[]) {
        CTest t = new CTest();
        t.test(3);
        t.test(8);
        t.test(0);
    }
}