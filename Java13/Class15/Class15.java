package Class15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ArgumentOutOfBound extends Exception {
}

public class Class15 {

    public static void mySqrt(double n) throws ArgumentOutOfBound { // ans
        if (n < 0) {
            System.out.println("n小於0");
            throw new ArgumentOutOfBound();
        } else {
            System.out.println(Math.pow(n, 0.5));
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inp = br.readLine();
            double inp2 = Double.parseDouble(inp);
            mySqrt(inp2);
        } catch (Exception e) {
        }
    }
}