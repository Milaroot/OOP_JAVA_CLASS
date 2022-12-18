package Java15;

class PrePaid extends Thread {
    int sm = 200;

    public void talk(int f) {
        try {
            sleep((int) (Math.random() * 1000));
            sm -= f;
        } catch (InterruptedException e) {
        }
        System.out.println("the sum is " + sum);
    }

    public void run() {
        while (sm > 10) {
            int f = (int) (Math.random() * 100);
            talk(f);
        }
    }
}

public class Class14 {
    public static void main(String[] args) {
        PrePaid p = new PrePaid();

        p.start();
    }
}