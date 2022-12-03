package Class14;

import java.util.Scanner;
import java.util.InputMismatchException;

class IntegerTooSmall extends Exception {
}

class IntegerTooLarge extends Exception {
}

public class Class14 {
    static void check(int inp) throws IntegerTooSmall, IntegerTooLarge {
        if (inp < 10) {
            System.out.println("您輸入的數太小");
            throw new IntegerTooSmall();
        } else if (inp > 70) {
            System.out.println("您輸入的數太大");
            throw new IntegerTooLarge();
        } else {
            System.out.println(inp);
        }
    }

    public static void main(String argv[]) throws IntegerTooSmall, IntegerTooLarge {
        Scanner sc = new Scanner(System.in);
        try {
            int inp = sc.nextInt();
            try {
                check(inp);
            } catch (Exception e) {
            }
        } catch (InputMismatchException ex) {
            System.out.println("您輸入的不是整數");
        }

    }
}