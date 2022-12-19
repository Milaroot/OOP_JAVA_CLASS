package Class06;

import java.io.*;

class Class05 {
    public static void main(String argv[]) {
        try {
            FileReader fr = new FileReader("Class06/train.txt");
            char data[] = new char[128];

            int num = fr.read(data);
            String str = new String(data, 0, num);
            System.out.println(num);

            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}