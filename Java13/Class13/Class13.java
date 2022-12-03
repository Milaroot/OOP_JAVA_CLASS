package Class13;

import java.util.Scanner;

class Exception520 extends Exception {
}

public class Class13 {
    static void check(int num) throws Exception520 {
        if (num == 520) {
            System.out.println("這是由字串 520 所引起的例外");
            throw new Exception520();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        try {
            int num = Integer.parseInt(inp);
            try {
                check(num);
                System.out.println(inp);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            System.out.println(inp);
        }
    }
}