package Class04;

import java.io.*;
import java.util.Scanner;

class Class04 {
    public static void main(String argv[]) throws IOException {

        FileReader fr = new FileReader("Class04/donkey.txt");

        char data[] = new char[48763];
        int txtLength = fr.read(data);
        String str = new String(data, 0, txtLength);
        System.out.println(txtLength);
    }
}