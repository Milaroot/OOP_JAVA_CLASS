package Java15;

class CBank {
    private static int sum = 0;

    public synchronized static void add(int n) { // ans
        int tmp = sum;
        tmp = tmp + n;

        try {
            Thread.sleep((int) (1000 * Math.random()));
        } catch (InterruptedException e) {
        }

        sum = tmp;
        System.out.println("sum = " + sum);
    }
}

class CCustomer extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            CBank.add(100);
        }
    }
}

public class Class13 {
    public static void main(String args[]) {
        CCustomer c1 = new CCustomer();
        CCustomer c2 = new CCustomer();

        c1.start();
        c2.start();
    }
}