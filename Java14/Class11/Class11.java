package Class11;

import java.io.*;

public class Class11 {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("Class11/number.txt");
        byte[] by = new byte[fis.available()];
        fis.read(by);
        System.out.println(new String(by));
    }
}