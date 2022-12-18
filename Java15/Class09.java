package Java15;

class sol extends Thread implements Runnable {
    int m = 48763;
    int t = 4876;

    sol(int m, int t) {
        this.m = m;
        this.t = t;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(t);
                System.out.println("Thread" + m + "is running");
            } catch (InterruptedException e) {
            }
        }
    }

}

public class Class09 {
    public static void main(String[] args) {
        sol r1 = new sol(1, 1000);
        sol r2 = new sol(2, 2500);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}