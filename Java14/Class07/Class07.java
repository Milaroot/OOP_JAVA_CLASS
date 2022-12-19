package Class07;

import java.io.*;
import java.util.Scanner;

class Class07 {
    public static void main(String argv[]) throws IOException {
        FileReader fr = new FileReader("Class07/donkey.txt");
        BufferedReader br = new BufferedReader(fr);
        int word_sm = 0;
        int flag = 0;
        while (br.ready()) {
            String tmp = br.readLine();
            System.out.println(tmp);
            word_sm += tmp.length();
            flag += 1;
            if (flag == 2) {
                br.skip(13);
            }
        }
        System.out.println(word_sm);
    }
}