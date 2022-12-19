package Class03;

import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inp = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= inp; i++) { // ans
            sum += i;
        }

        System.out.printf("1 to %d sum is %d", inp, sum);
    }
}